package people;

import java.util.ArrayList;

public class Chef {
    private String name;
    private ArrayList<String> cookHistory = new ArrayList<>();

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCookHistory(String food, int quantity) {
        cookHistory.add(quantity + "x " + food);
    }

    public void showCookHistory() {
        System.out.println("Chef " + name + "'s Cook History:");
        for (String entry : cookHistory) {
            System.out.println("   - " + entry);
        }
        System.out.println();
    }
}
