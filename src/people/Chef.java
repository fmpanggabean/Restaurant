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
        System.out.println("\nChef " + name + "'s cook history:");
        for (String ch : cookHistory) {
            System.out.println("	-" + ch);
        }
    }
}
