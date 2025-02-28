package behavioral_patterns.iterator;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        ProductCard productCard = new ProductCard(Map.of("name", "laptop",
                "prise", "1000",
                "category", "electronic",
                "manufacturer", "Honor")
        );

        IteratorX<String> iterator = productCard.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(productCard);
    }
}
