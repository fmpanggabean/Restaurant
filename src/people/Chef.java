package people;

import main.*;

import java.util.*;

public class Chef {

    private String name;
    private List<String> cooking_history = new ArrayList<>();

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCooking_history() {
        return cooking_history;
    }

    public void setCooking_history(List<String> cooking_history) {
        this.cooking_history = cooking_history;
    }

    public void addCooking_history(int qty, String food_name, Visitor visitor, double price) {
        cooking_history.add("(" + qty + ") " + food_name + " was cooked for " + visitor.getName() + ", total price: " + Main.formatRupiah(price));
    }

    public void showCookHistory() {
        System.out.println(this.name + "'s Cooking History:");
        for (String str : cooking_history) {
            System.out.println("- " + str);
        }

        System.out.println();
    }
}
