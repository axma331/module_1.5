package structure_design_patterns.adapter;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        System.out.println("\n=======================\n");
        CarFloatingAdapter carFloatingAdapter = new CarFloatingAdapter(car);
        carFloatingAdapter.sail();
    }
}
