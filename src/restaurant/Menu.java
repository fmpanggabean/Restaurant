package restaurant;

import main.Food;
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

    public Food getFood(String name) {
        for (Food food : foods) {
            if (food.getName().equalsIgnoreCase(name)) {
                return food;
            }
        }
        return null;
    }

    public void showMenu() {
        System.out.println("=== " + category + " ===");
        for (Food food : foods) {
            System.out.println(food.getName() + " - " +food.getPrice());
        }
        System.out.println();
    }
}
