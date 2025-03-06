package behavioral_patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Visitable {
    private final List<Product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Cart add(Product product) {
        items.add(product);
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<Product> getItems() {
        return items;
    }
}
