package structure_design_patterns.bridgepattern;

public class OzonPlatform implements Marketplace{
    @Override
    public String getPlatformName() {
        return "Ozon";
    }

    @Override
    public int getSizeOfMarkupMultiplier() {
        return 3;
    }
}
