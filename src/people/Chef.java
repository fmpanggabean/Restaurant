package people;

import java.util.*;

public class Chef {
    private String name;
    private List<String>cookHistory = new ArrayList<>();

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCookHistory(String cookString) {
        cookHistory.add(cookString);
    }

    public void showCookHistory() {
        System.out.println("\nCook History of " + name + ":");
        for (String string : cookHistory) {
            System.out.println(string);
        }
    }
}
