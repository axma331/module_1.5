package creational_pattern.abstractfactory.model.impl;

import creational_pattern.abstractfactory.model.Smartphone;

public class SmartphoneByHuawei implements Smartphone {
    @Override
    public String getParameters() {
        return "Huawei smartphone parameters";
    }
}
