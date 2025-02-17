package creational_pattern.builderpattern.builder;


public class WBProductCardBuilder extends ProductCardBuilder {
    private int procurementPrice;

    @Override
    public void buildName(String name) {
        parameters.put("name", name);
    }

    @Override
    public void buildDescription(String description) {
        parameters.put("description", description);
    }

    @Override
    public void buildProcurementPrice(int price) {
        procurementPrice = price;
        parameters.put("procurementPrice", Integer.toString(procurementPrice));
    }

    @Override
    protected void setMarketplaceName() {
        parameters.put("marketplaceName", "WB");
    }

    @Override
    protected void buildSalePrice() {
        parameters.put("salePrice", String.valueOf(procurementPrice * 2));
    }
}
