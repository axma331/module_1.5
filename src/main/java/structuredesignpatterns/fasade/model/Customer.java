package structuredesignpatterns.fasade.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final List<Integer> orderIds;

    public Customer(String firstName, String lastName, String phoneNumber,  int id) {
        orderIds = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void addOrderIds(int orderId) {
        orderIds.add(orderId);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", orderIds=" + orderIds +
                '}';
    }
}
