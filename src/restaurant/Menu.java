package restaurant;

import java.util.*;

public class Menu {
    private String name;
    private List<Food> foods = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
        this.foods = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Food food) {
        foods.add(food);
    }

    public List<Food> getFoods() {
        return foods;
    }
}
