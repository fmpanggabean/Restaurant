package people;


import java.util.*;
public class Chef {
    private String name;
    private List<String> cookHistory = new ArrayList<>();

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCookHistory(String foodName, int quantity) {
        cookHistory.add(foodName + " x" + quantity);
    }

    public void showCookHistory() {
        System.out.println(name + "'s cook history:");
        for (String history : cookHistory) {
            System.out.println(history);
        }
    }
}
