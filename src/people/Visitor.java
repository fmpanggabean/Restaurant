package people;

import main.Main;

public class Visitor {
    private String name;
    private int totalBill;

    public Visitor(String name) {
        this.name = name;
        this.totalBill = 0;
    }

    public void addToBill(int amount) {
        totalBill += amount;
    }

    public void showTotalPrice() {
        System.out.println("Total Bill for " + name + ": " + Main.formatIDR(totalBill));
        System.out.println("");
    }
}