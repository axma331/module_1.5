package creational_pattern.factoriespattern;

import java.util.Map;

public abstract class Marketplace {
    protected ProductCard productCard;

    public void render() {
        Map<String, String> card = productCard.getCard();
        card.keySet().forEach(key -> {
            System.out.println(key + ": " + card.get(key));
        });
    }
}
