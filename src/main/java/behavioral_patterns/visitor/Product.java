package behavioral_patterns.visitor;

public record Product (String name, double price) implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
