package people;

import java.util.HashMap;
import java.util.Map;

public class Chef {
    private String name;
    private Map<String, Integer> cookHistory;

    public Chef(String name) {
        this.name = name;
        this.cookHistory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void cook(String foodName, int quantity) {
        cookHistory.put(foodName, cookHistory.getOrDefault(foodName, 0) + quantity);
    }

    public void showCookHistory() {
        System.out.println("\nChef " + name + " telah memasak:");
        for (Map.Entry<String, Integer> entry : cookHistory.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " porsi");
        }
    }
}
