package structuredesignpatterns.decorator;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BaseProductCard implements ProductCard {
    private final Map<String, String> productCardDetails;


    public BaseProductCard(Product laptop) {
        productCardDetails = new HashMap<>();
        fillProductCard(laptop);
    }

    protected void fillProductCard(Product laptop) {
        productCardDetails.put("name", laptop.getName());
        productCardDetails.put("description", laptop.getDescription());
        productCardDetails.put("cost", String.valueOf(laptop.getCost()));
    }

    @Override
    public Map<String, String> getProductCardDetails() {
        return productCardDetails;
    }

    @Override
    public String toString() {
        return productCardDetails.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue())
                .collect(Collectors.joining("\n"));
    }
}
