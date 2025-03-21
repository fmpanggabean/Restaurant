package people;

import java.util.HashMap;
import java.util.Map;

public class Visitor {
    private String name;
    private Map<String, Integer> orders = new HashMap<>();
    private int totalPrice = 0;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addOrder(String food, int price, int quantity) {
        orders.put(food, orders.getOrDefault(food, 0) + quantity);
        totalPrice += price * quantity;
    }

    public void showTotalPrice() {
        System.out.println("Visitor " + name + " total price: " + totalPrice);
    }
}
