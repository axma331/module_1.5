package creational_pattern.builderpattern.builder;

public interface Builder {
    void buildName(String name);
    void buildDescription(String description);
    void buildProcurementPrice(int price);
}
