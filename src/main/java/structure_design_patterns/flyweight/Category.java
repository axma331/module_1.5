package structure_design_patterns.flyweight;

public record Category(String name) {
    public Category(String name) {
        this.name = name;
        System.out.println("Category created "  + this.name);
    }
}
