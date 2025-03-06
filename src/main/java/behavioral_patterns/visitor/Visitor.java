package behavioral_patterns.visitor;

public interface Visitor {
    void visit(Product product);
    void visit(Cart cart);
}
