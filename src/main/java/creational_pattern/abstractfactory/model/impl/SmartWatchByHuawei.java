package creational_pattern.abstractfactory.model.impl;

import creational_pattern.abstractfactory.model.SmartWatch;

public class SmartWatchByHuawei implements SmartWatch {
    @Override
    public String getParameters() {
        return "Huawei smart watch parameters";
    }
}
