package creational_pattern.abstractfactory.model.impl;

import creational_pattern.abstractfactory.model.SmartWatch;

public class SmartWatchByHonor implements SmartWatch {
    @Override
    public String getParameters() {
        return "Honor smart watch parameters";
    }
}
