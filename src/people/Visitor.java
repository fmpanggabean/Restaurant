package people;

import java.util.*;

public class Visitor {
    private String name;
    private int totalPrice;

    public Visitor(String name) {
        this.name = name;
        this.totalPrice = 0;
    }

    public String getName() {
        return name;
    }

    public void addToTotalPrice(int price) {
        totalPrice += price;
    }

    public void showTotalPrice() {
        System.out.println("\nTotal price for " + name + ": Rp " + totalPrice);
    }
}
