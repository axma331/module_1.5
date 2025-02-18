package structuredesignpatterns.bridgepattern;

public class WBPlatform implements Marketplace{
    @Override
    public String getPlatformName() {
        return "WB";
    }

    @Override
    public int getSizeOfMarkupMultiplier() {
        return 2;
    }
}
