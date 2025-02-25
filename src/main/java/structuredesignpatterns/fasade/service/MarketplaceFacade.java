package structuredesignpatterns.fasade.service;

import structuredesignpatterns.fasade.model.OrderStatus;
import structuredesignpatterns.fasade.model.Product;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;


public class MarketplaceFacade {
    private static final Scanner scanner = new Scanner(System.in);
    private CustomerManager customerManager;
    private OrderManager orderManager;
    private ProductManager productManager;


    public MarketplaceFacade(CustomerManager customerManager, OrderManager orderManager, ProductManager productManager) {
        this.customerManager = customerManager;
        this.orderManager = orderManager;
        this.productManager = productManager;
    }

    public void startMenu() {
        System.out.println("Welcome to the Marketplace Facade");
        System.out.println("Введите через пробел данные для регистрации пользователя:");
        String[] inputStr = scanner.nextLine().split(" ");
        int customerId = customerManager.registerCustomer(inputStr[0], inputStr[1], inputStr[2]);

        System.out.println(customerManager);

        System.out.println("Выберите желаемый товар для формирование заказа:");
        productManager.showAllProducts();
        String selectedProductName = scanner.nextLine();
        Product product = productManager.getProduct(selectedProductName);

        System.out.println(product);

        System.out.println("Укажите откуда и куда необходимо доставить заказ:");
        String[] location = scanner.nextLine().split(" ");
        int orderId = orderManager.createOrder(product, customerId, location[0], location[1]);
        System.out.println(orderManager.getOrder(orderId));

        ScheduledExecutorService scheduler = newSingleThreadScheduledExecutor();
        scheduler.schedule(
                () -> orderManager.changeOrderStatus(orderId, OrderStatus.COMPLETED), 5, TimeUnit.SECONDS
        );
        scheduler.shutdown();

        System.out.println("Для проверки статуса заказа укажите его номер?");
        int id = Integer.parseInt(scanner.nextLine());
        String answer;
        do {
            System.out.println(orderManager.getOrderStatus(id));
            System.out.println("Хотите еще раз проверить статус доставки?");
            answer = scanner.nextLine();
        } while (answer.equals("да"));

        System.out.println("Finish");
        scanner.close();
    }


}
