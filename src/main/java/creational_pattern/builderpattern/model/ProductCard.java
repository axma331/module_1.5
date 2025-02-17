package creational_pattern.builderpattern.model;

import java.util.Map;
import java.util.stream.Collectors;

public record ProductCard(Map<String, String> card) {
    @Override
    public String toString() {
        return card.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue())
                .collect(Collectors.joining("\n"));
    }
}
