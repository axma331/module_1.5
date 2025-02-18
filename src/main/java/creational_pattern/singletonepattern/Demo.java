package creational_pattern.singletonepattern;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class Demo {
    public static void main(String[] args) {
        CompletableFuture<SingletonClass> obj_1 = CompletableFuture.supplyAsync(SingletonClass::getInstance);
        CompletableFuture<SingletonClass> obj_2 = CompletableFuture.supplyAsync(SingletonClass::getInstance);
        CompletableFuture<SingletonClass> obj_3 = CompletableFuture.supplyAsync(SingletonClass::getInstance);

        SingletonClass join_1 = obj_1.join();
        SingletonClass join_2 = obj_2.join();
        SingletonClass join_3 = obj_3.join();

        System.out.println("Instance 1: " + join_1);
        System.out.println("Instance 2: " + join_2);
        System.out.println("Instance 3: " + join_3);
        System.out.println(Objects.equals(join_1, join_2) && Objects.equals(join_1, join_3));
    }
}
