package creational_pattern.abstractfactory.model.impl;

import creational_pattern.abstractfactory.model.Laptop;

public class LaptopByHonor implements Laptop {
    @Override
    public String getParameters() {
        return "Honor laptop parameters";
    }
}
