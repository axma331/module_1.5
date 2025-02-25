package structuredesignpatterns.fasade.model;

import java.util.Map;

public record SomeTypeProduct(String name, String description, int cost) implements Product {
    @Override
    public Map<String, String> getAttributes() {
        return Map.of(
                "name", name,
                "description", description,
                "cost", String.valueOf(cost)
        );
    }
}
