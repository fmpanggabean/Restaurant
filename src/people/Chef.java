package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private String name;
    private List<String> cookHistory;

    public Chef(String name) {
        this.name = name;
        this.cookHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addToCookHistory(String foodName, int quantity) {
        cookHistory.add(quantity + "x " + foodName);
    }

    public void showCookHistory() {
        System.out.println("Cook History for " + name + ":");
        for (String entry : cookHistory) {
            System.out.println("	- " + entry);
        }
        System.out.println("");
    }
}