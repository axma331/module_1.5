package creational_pattern.abstractfactory.factory.impl;

import creational_pattern.abstractfactory.factory.BrandProducts;
import creational_pattern.abstractfactory.model.Laptop;
import creational_pattern.abstractfactory.model.SmartWatch;
import creational_pattern.abstractfactory.model.Smartphone;
import creational_pattern.abstractfactory.model.impl.LaptopByHonor;
import creational_pattern.abstractfactory.model.impl.SmartWatchByHonor;
import creational_pattern.abstractfactory.model.impl.SmartphoneByHonor;

public class HonorProducts implements BrandProducts {
    @Override
    public Laptop getLaptop() {
        return new LaptopByHonor();
    }

    @Override
    public Smartphone getSmartphone() {
        return new SmartphoneByHonor();
    }

    @Override
    public SmartWatch getSmartWatch() {
        return new SmartWatchByHonor();
    }
}
