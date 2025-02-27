package behavioral_patterns.iterator;

import java.util.Map;

public class ProductCard implements Aggregate<String> {
    private Map<String, String> attribute;

    public ProductCard(Map<String, String> attribute) {
        this.attribute = attribute;
    }

    @Override
    public IteratorX<String> getIterator() {
        return new ValueOfAttributesIterator(attribute);
    }

    @Override
    public String toString() {
        return "ProductCard attribute:\n" + attribute;
    }
}
