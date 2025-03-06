package behavioral_patterns.template;

public class FBSOrder extends Order {
    @Override
    protected void chooseWarehouse() {
        System.out.println("Отгрузка со склада продавца!");
    }

    @Override
    protected void chooseDeliveryMethod() {
        System.out.println("Товар доставит продавец собственными силами");
    }
}
