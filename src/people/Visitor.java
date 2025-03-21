package people;

import java.util.*;

public class Visitor {
    String name;
    int total = 0;
    List<String> orders = new ArrayList<>();

    public Visitor(String name) {
        this.name = name;
    }

    public void order(String foodName, int quantity, int price) {
        int totalPrice = quantity * price;
        total += totalPrice;
        orders.add(foodName + " x" + quantity + " (Total: Rp" + totalPrice + ")");
    }

    public void showTotalPrice() {
        System.out.println("- " + name + " ordered:");
        for (String order : orders) {
            System.out.println("  - " + order);
        }
        System.out.println("  Total Spent: " + total);
    }
    
}
