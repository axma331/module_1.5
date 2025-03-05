package behavioral_patterns.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        // Создаем заказ
        Order order = new Order();

        // Проверяем начальное состояние (EmptyState)
        System.out.println("--- Initial State (EmptyState) ---");
        order.getState().addProduct(); // Добавляем товар
        order.getState().removeProduct(); // Пытаемся удалить товар (корзина пуста)
        order.getState().usePromotionalCode(); // Пытаемся использовать промокод
        order.getState().payOrder(); // Пытаемся оплатить заказ
        order.getState().trackDelivery(); // Пытаемся отследить доставку

        // Добавляем товары до заполнения корзины
        System.out.println("\n--- Adding Products (AssembledState) ---");
        order.getState().addProduct(); // Добавляем первый товар
        order.getState().addProduct(); // Добавляем второй товар
        order.getState().removeProduct(); // Пытаемся удалить товар
        order.getState().removeProduct(); // Пытаемся удалить товар (меняем состояние)
        order.getState().addProduct(); // Добавляем второй товар
        order.getState().addProduct(); // Добавляем второй товар
        order.getState().usePromotionalCode();
        order.getState().payOrder();
        order.getState().trackDelivery();
        order.getState().addProduct(); // Добавляем третий товар (корзина заполнена)


        // Проверяем состояние после заполнения корзины (PaymentState)
        System.out.println("\n--- PaymentState ---");
        order.getState().addProduct(); // Пытаемся добавить товар (корзина заполнена)
        order.getState().removeProduct(); // Удаляем товар
        order.getState().usePromotionalCode(); // Используем промокод
        order.getState().payOrder(); // Оплачиваем заказ

        // Проверяем состояние после оплаты (DeliveryState)
        System.out.println("\n--- DeliveryState ---");
        order.getState().addProduct(); // Пытаемся добавить товар (заказ оплачен)
        order.getState().removeProduct(); // Пытаемся удалить товар (заказ оплачен)
        order.getState().usePromotionalCode(); // Пытаемся использовать промокод (заказ оплачен)
        order.getState().payOrder(); // Пытаемся оплатить заказ (уже оплачен)
        order.getState().trackDelivery(); // Отслеживаем доставку (первый вызов)
        order.getState().trackDelivery(); // Отслеживаем доставку (второй вызов, заказ доставлен)

        // Проверяем, доставлен ли заказ
        System.out.println("\n--- Order Delivery Status ---");
        if (order.isDelivered()) {
            System.out.println("The order has been delivered!");
        } else {
            System.out.println("The order is still in delivery.");
        }
    }
}
