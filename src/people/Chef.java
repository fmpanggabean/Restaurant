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

    public void cook(String food, int quantity) {
        cookHistory.put(food, cookHistory.getOrDefault(food, 0) + quantity);
    }

    public void showCookHistory() {
        System.out.println("Riwayat memasak " + name + ":");
        for (Map.Entry<String, Integer> entry : cookHistory.entrySet()) {
            System.out.println("- " + entry.getKey() + " x" + entry.getValue());
        }
    }
}