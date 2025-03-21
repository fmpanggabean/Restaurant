package people;

import main.Main;

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
        this.totalPrice += price;
    }

    public void showTotalPrice() {
        System.out.println("Total price for " + name + ": " + Main.formatIDR(totalPrice));
    }

    public String toString() {
        return "Visitor{name='" + name + "', totalPrice=" + Main.formatIDR(totalPrice) + "}";
    }
}
