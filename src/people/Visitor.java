package people;

import main.Helper;

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
        System.out.println(name + "'s total price: " + Helper.formatIDR(totalPrice));
    }

}
