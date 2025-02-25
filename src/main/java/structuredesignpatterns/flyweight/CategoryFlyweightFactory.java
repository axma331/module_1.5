package structuredesignpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CategoryFlyweightFactory {
    private final static Map<String, Category> categories = new HashMap<>();

    public Category getCategory(String name) {
        return categories.computeIfAbsent(name, Category::new);
    }
}
