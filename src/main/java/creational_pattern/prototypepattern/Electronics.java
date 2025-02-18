package creational_pattern.prototypepattern;

public abstract class Electronics {
    protected String name;
    protected int cost;
    protected int price;

    public Electronics(String name, int cost, int price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    public Electronics(Electronics other) {
        if (other != null) {
            name = other.name;
            cost = other.cost;
            price = other.price;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Electronics)) {
            return false;
        }
        Electronics other = (Electronics) obj;
        return name.equals(other.name) && cost == other.cost && price == other.price;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }

    public abstract Electronics clone();
}
