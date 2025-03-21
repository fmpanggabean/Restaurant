package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String type;
    private final List<Food> foods;

    public Menu(String type) {
        this.foods = new ArrayList<>();
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void add(Food food){
        foods.add(food);
    }
}
