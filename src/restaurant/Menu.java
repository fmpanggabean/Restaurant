package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<Food> foods;

    public Menu(String category) {
        this.category = category;
        this.foods = new ArrayList<>();
    }

    public void add(Food food) {
        foods.add(food);
    }

    public List<Food> getFoods() {
        return foods;
    }

    public String getCategory() {
        return category;
    }
}