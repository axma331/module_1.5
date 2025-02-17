package creational_pattern.builderpattern;

import creational_pattern.builderpattern.builder.Builder;

public class DirectorBuilder {
    public static void constructLaptop(Builder builder){
        builder.buildName("Honor X14");
        builder.buildDescription("Laptop with good autonomy and high-quality display.");
        builder.buildProcurementPrice(50000);
    }

    public static void constructSmartphone(Builder builder){
        builder.buildName("Honor 20 Pro");
        builder.buildDescription("A smartphone with good autonomy and an excellent camera.");
        builder.buildProcurementPrice(25000);
    }
}
