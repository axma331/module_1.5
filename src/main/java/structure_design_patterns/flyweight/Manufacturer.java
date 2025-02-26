package structure_design_patterns.flyweight;

public record Manufacturer(String name) {
    public Manufacturer(String name) {
        this.name = name;
        System.out.println("Manufacturer created " + this.name);
    }
}
