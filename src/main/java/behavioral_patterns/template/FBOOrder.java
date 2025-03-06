package behavioral_patterns.template;

public class FBOOrder extends Order {
    @Override
    protected void chooseWarehouse() {
        System.out.println("Отгрузка со склада маркетплейса.");
    }

    @Override
    protected void chooseDeliveryMethod() {
        System.out.println("Доставка будет осуществлена в пункт выдачи.");
    }
}
