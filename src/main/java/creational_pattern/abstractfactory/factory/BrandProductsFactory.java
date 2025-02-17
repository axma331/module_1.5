package creational_pattern.abstractfactory.factory;

import creational_pattern.abstractfactory.model.Laptop;
import creational_pattern.abstractfactory.model.SmartWatch;
import creational_pattern.abstractfactory.model.Smartphone;

public interface BrandProducts {
    Laptop getLaptop();
    Smartphone getSmartphone();
    SmartWatch getSmartWatch();
}
