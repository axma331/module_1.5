package structuredesignpatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements Package {
    private final List<Package> packageList;
    private int capacity;
    private int size;

    public Box(int sizeBox) {
        packageList = new ArrayList<>();
        size = capacity = sizeBox;
    }

    public Box(Package... packages) {
        packageList = new ArrayList<>(Arrays.asList(packages));
        capacity = packageList.stream().mapToInt(Package::getSize).sum();
        size = 0;

    }

    void add(Package p) {
        if (packageList.size() < size) {
            packageList.add(p);
            size -= p.getSize();
        } else {
            System.out.println("Package is full");
        }
    }

    @Override
    public int getPrice() {
        return packageList.stream().mapToInt(Package::getPrice).sum();
    }

    @Override
    public int getSize() {
        return packageList.stream().mapToInt(Package::getSize).max().orElse(0);
    }
}
