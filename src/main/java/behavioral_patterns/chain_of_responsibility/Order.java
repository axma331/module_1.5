package behavioral_patterns.chain_of_responsibility;

public record Order(String toLocation, int totalPrice, boolean isAuthUser) {
    @Override
    public String toString() {
        return "Order{" +
                "toLocation='" + toLocation + '\'' +
                ", totalPrice=" + totalPrice +
                ", isAuthUser=" + isAuthUser +
                '}';
    }
}
