package structuredesignpatterns.composite;

public class Demo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Honor x14", "Not bad laptop", 30000, 4);
        Laptop laptop1 = new Laptop("Honor x15", "Not bad laptop", 30000, 5);
        Smartphone smartphone = new Smartphone("Huawei p60", "Very well phone", 20000, 2);

        Box litleBox = new Box(5);
        litleBox.add(smartphone);
        System.out.println("\n==========================\n");
        litleBox.add(smartphone);

        System.out.println("\n==========================\n");
        Box bigBox = new Box(laptop, smartphone, laptop1);
        System.out.println("\n==========================\n");
        bigBox.add(smartphone);
    }
}
