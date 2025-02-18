package creational_pattern.prototypepattern;

import java.util.Objects;

public class Demo {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone(
                "Honor 20",
                20000,
                300000,
                true,
                true,
                "Wi-Fi"
        );

        Smartphone phoneClone =(Smartphone) phone.clone();

        System.out.println(phone);
        System.out.println(phoneClone);
        System.out.println(Objects.equals(phone, phoneClone));
    }
}
