package people;

import main.*;

public class Visitor {
    public String name;
    public Integer totalSpend = 0; 

    public Visitor(String name) {
        this.name = name;
    }

    public void showTotalPrice() {
        System.out.println(name + " total spend: " + Main.formatIDR(totalSpend));
    }
}
