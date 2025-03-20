package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private String name;
    private List<String> cookHistory;
    private List<Integer> cookQuantity;
    public Chef(String name) {
        this.name = name;
        this.cookHistory = new ArrayList<>();
        this.cookQuantity = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void cook(String foodName, int quantity) {
        cookHistory.add(foodName);
        cookQuantity.add(quantity);
    }

    public void showCookHistory() {
        System.out.println("\nChef " + name + "'s Cooking History:");
        for (int i = 0; i < cookHistory.size(); i++) {
            System.out.println(cookHistory.get(i) + " - " + cookQuantity.get(i) + " servings");
        }
    }
}
