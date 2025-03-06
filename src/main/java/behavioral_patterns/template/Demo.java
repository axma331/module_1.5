package behavioral_patterns.template;

public class Demo {
    public static void main(String[] args) {

        new FBOOrder().placeOrder();
        System.out.println("--------------------------");
        new FBSOrder().placeOrder();

    }
}
