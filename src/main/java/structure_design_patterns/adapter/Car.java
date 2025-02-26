package structure_design_patterns.adapter;

public class Car implements LandTransport {
    @Override
    public void drive() {
        System.out.println("The car rides along the road");
    }
}
