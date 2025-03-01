package behavioral_patterns.memento;

public class Demo {
    public static void main(String[] args) {
        Product product = new Product("Laptop", "High-end gaming laptop", 1000, 1500, "BrandX");

        System.out.println("Initial state:");
        System.out.println(product);

        Caretaker caretaker = new Caretaker();

        caretaker.makeBackup(product);
        System.out.println("Backup 1 created.");

        product.setName("Ultrabook");
        product.setDescription("Lightweight and powerful");
        product.setCost(1200);
        product.setPrice(1800);
        product.setManufacturer("BrandY");

        System.out.println("\nState after modification 1:");
        System.out.println(product);

        caretaker.makeBackup(product);
        System.out.println("Backup 2 created.");

        product.setName("Tablet");
        product.setDescription("Portable and versatile");
        product.setCost(800);
        product.setPrice(1200);
        product.setManufacturer("BrandZ");

        System.out.println("\nState after modification 2:");
        System.out.println(product);

        System.out.println("\nRestoring to previous state...");
        caretaker.undo(product);
        System.out.println("\nState after undo 1:");
        System.out.println(product);

        System.out.println("\nRestoring to initial state...");
        caretaker.undo(product);
        System.out.println("\nState after undo 2:");
        System.out.println(product);

        System.out.println("\nTrying to restore again...");
        caretaker.undo(product);
    }
}