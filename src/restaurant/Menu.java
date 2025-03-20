package restaurant;

import java.util.*;

public class Menu {

    private String name;
    private List<Food> foods = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public void add(Food food) {
        this.foods.add(food);
    }
}
