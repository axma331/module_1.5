package creational_pattern.abstractfactory.factory.impl;

import creational_pattern.abstractfactory.factory.BrandProducts;
import creational_pattern.abstractfactory.model.Laptop;
import creational_pattern.abstractfactory.model.SmartWatch;
import creational_pattern.abstractfactory.model.Smartphone;
import creational_pattern.abstractfactory.model.impl.LaptopByHuawei;
import creational_pattern.abstractfactory.model.impl.SmartWatchByHuawei;
import creational_pattern.abstractfactory.model.impl.SmartphoneByHuawei;

public class HuaweiProducts implements BrandProducts {
    @Override
    public Laptop getLaptop() {
        return new LaptopByHuawei();
    }

    @Override
    public Smartphone getSmartphone() {
        return new SmartphoneByHuawei();
    }

    @Override
    public SmartWatch getSmartWatch() {
        return new SmartWatchByHuawei();
    }
}
