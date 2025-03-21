package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private String name;
    List<String> cookHistory = new ArrayList<>();

    public Chef(String name) {
        this.name = name;
    }
    public void addOrder(String foodName, int qty){
        cookHistory.add(foodName + " " + qty);
    }
    public void showCookHistory(){
        System.out.println("Chef " + this.name + " has cooked:");
        for (String string : cookHistory) {
            System.out.println(string);
        }
    }

    public String getName() {
        return name;
    }
}
