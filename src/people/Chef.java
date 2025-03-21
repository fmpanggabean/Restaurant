package people;

import java.util.ArrayList;

import restaurant.*;

public class Chef {
    public String name;
    public ArrayList<String> history_Orders = new ArrayList<>();

    public Chef(String name) {
        this.name = name;
        Restaurant.chefs.add(this);
    }

    public void showCookHistory() {
        System.out.println("===================================");
        System.out.println("Cook history of " + name);
        for (String history : history_Orders) {
            System.out.println(history);
        }
    }
}
