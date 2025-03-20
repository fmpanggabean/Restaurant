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

    public void addCookHistory(String ch) {
        cookHistory.add(ch);
    }

    public void showCookHistory() {
        System.out.println("\nHistory Memasak " + "Chef " + name + ": ");
        for (String cookHistory : cookHistory) {
            System.out.println("  -" + cookHistory);
        }
    }
}
