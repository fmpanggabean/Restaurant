package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Food> foods = new ArrayList<>();
   

    public Menu(String name) {
        this.name = name;
    }

    public void add(Food food) {
        foods.add(food);
    }

    public List<Food> getFoods() {
        return foods;
    }
    public String getName() {
        return name;
    }

}
