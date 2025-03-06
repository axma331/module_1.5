package behavioral_patterns.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
