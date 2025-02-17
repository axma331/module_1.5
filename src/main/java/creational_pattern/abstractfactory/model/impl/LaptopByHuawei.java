package creational_pattern.abstractfactory.model.impl;

import creational_pattern.abstractfactory.model.Laptop;

public class LaptopByHuawei implements Laptop {
    @Override
    public String getParameters() {
        return "Huawei laptop parameters";
    }
}
