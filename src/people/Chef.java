package people;

import java.util.*;

public class Chef {
    private final String name;
    private final List<String> cookHistory;

    public Chef(String name) {
        this.name = name;
        this.cookHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCookHistory(String visitorName, String foodName, int quantity) {
        cookHistory.add(visitorName + " memesan " + quantity + " " + foodName);
    }

    public void showCookHistory() {
        System.out.println("Riwayat masakan " + name + ":");
        for (String history : cookHistory) {
            System.out.println(history);
        }
    }
}
