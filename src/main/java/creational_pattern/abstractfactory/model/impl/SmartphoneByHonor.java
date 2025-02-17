package creational_pattern.abstractfactory.model.impl;

import creational_pattern.abstractfactory.model.Smartphone;

public class SmartphoneByHonor implements Smartphone {
    @Override
    public String getParameters() {
        return "Honor smartphone parameters";
    }
}
