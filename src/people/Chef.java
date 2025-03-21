package people;
import java.util.*;

public class Chef {
    private String name;
    private Map<String, Integer> cookHistory = new HashMap<>();;

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cook(String foodName, int quantity) {
        cookHistory.put(foodName, cookHistory.getOrDefault(foodName, 0) + quantity);
    }

    public void showCookHistory() {
        System.out.println("Riwayat memasak Chef " + name + ":");
        for (Map.Entry<String, Integer> entry : cookHistory.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " porsi");
        }
    }
}