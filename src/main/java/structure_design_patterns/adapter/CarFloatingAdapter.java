package structure_design_patterns.adapter;

public class CarFloatingAdapter implements WaterTransport  {
    Car car;

    public CarFloatingAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void sail() {
        System.out.println("Installation of the raft");
        System.out.println("The car is floating through the water");
    }
}
