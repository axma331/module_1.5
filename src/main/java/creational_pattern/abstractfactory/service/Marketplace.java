package creational_pattern.abstractfactory.service;

import creational_pattern.abstractfactory.factory.BrandProductsFactory;
import creational_pattern.abstractfactory.model.Laptop;
import creational_pattern.abstractfactory.model.SmartWatch;
import creational_pattern.abstractfactory.model.Smartphone;

public class Marketplace {
    BrandProductsFactory factory;

    public Marketplace(BrandProductsFactory factory) {
        this.factory = factory;
    }

    public void showProducts() {
        Laptop laptop = factory.getLaptop();
        Smartphone smartphone = factory.getSmartphone();
        SmartWatch smartWatch = factory.getSmartWatch();

        System.out.println("Laptop: " + laptop.getParameters());
        System.out.println("SmartPhone: " + smartphone.getParameters());
        System.out.println("SmartWatch: " + smartWatch.getParameters());

    }
}
