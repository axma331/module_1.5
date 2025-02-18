package structuredesignpatterns.adapter;

public class Car implements LandTransport {
    @Override
    public void drive() {
        System.out.println("The car rides along the road");
    }
}
