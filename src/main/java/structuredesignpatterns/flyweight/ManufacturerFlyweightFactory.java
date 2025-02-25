package structuredesignpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ManufacturerFlyweightFactory {
    private static final Map<String, Manufacturer> manufacturers = new HashMap<>();

    public Manufacturer getManufacturer(String name) {
        return manufacturers.computeIfAbsent(name, Manufacturer::new);
    }
}
