package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private String name;
    private List<String> cookHistory;

    public Chef(String name) {
        this.name = name;
        this.cookHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void cook(String foodName, int quantity) {
        String record = "Memasak " + quantity + " " + foodName;
        cookHistory.add(record);
        System.out.println(name + " " + record);
    }

    public void showCookHistory() {
        System.out.println("Riwayat masakan " + name + ":");
        for (String record : cookHistory) {
            System.out.println("- " + record);
        }
    }
}
