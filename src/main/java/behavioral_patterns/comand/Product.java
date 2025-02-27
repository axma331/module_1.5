package behavioral_patterns.comand;

import java.util.Random;

public class Product {
    private static Random random = new Random();
    private String name;

    public Product() {
        name = "Product " + (char)random.nextInt(48, 97);
    }

    @Override
    public String toString() {
        return name;
    }
}
