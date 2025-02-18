package creational_pattern.prototypepattern;

public class Smartphone extends Electronics{
    private boolean hasSIMSlot;
    private boolean radioModule;
    private String networkModule;

    public Smartphone(String name, int cost, int price, boolean hasSIMSlot, boolean radioModule, String networkModule) {
        super(name, cost, price);
        this.hasSIMSlot = hasSIMSlot;
        this.radioModule = radioModule;
        this.networkModule = networkModule;
    }

    public Smartphone(Smartphone other) {
        super(other);
        this.hasSIMSlot = other.hasSIMSlot;
        this.radioModule = other.radioModule;
        this.networkModule = other.networkModule;
    }

    @Override
    public Electronics clone() {
        return new Smartphone(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Smartphone) || !super.equals(obj)) {
            return false;
        }
        Smartphone other = (Smartphone) obj;
        return hasSIMSlot == other.hasSIMSlot
                && radioModule == other.radioModule
                && networkModule.equals(other.networkModule);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "hasSIMSlot=" + hasSIMSlot +
                ", radioModule=" + radioModule +
                ", networkModule='" + networkModule + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
