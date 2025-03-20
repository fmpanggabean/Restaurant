package people;

import main.*;

public class Visitor {

    private String name;
    private int total_price;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public void addTotal_Price(double price) {
        total_price = (int) (total_price + price);
    }

    public void showTotalPrice() {
        System.out.println(name + " paid for " + Main.formatRupiah(total_price));
        System.out.println();
    }
}
