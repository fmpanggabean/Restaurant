package people;

import main.currHelper;

public class Visitor {
    private String name;
    private int totalPrice = 0;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void showTotalPrice() {
        System.out.println("Total harga untuk pelanggan " + name + ": " + currHelper.formatIDR(totalPrice));
    }

}