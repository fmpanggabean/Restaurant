package restaurant;

import java.util.*;

public class Menu {
    public String type;
    public ArrayList<Food> foods = new ArrayList<>();

    public Menu(String type) {
        this.type = type;
    }

    public void add(Food food) {
        foods.add(food);
    }
}
