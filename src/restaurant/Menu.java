package restaurant;

import java.util.*;

public class Menu {
    private String category;
    private List<Food> foods = new ArrayList<>();

    public Menu(String category) {
        this.category = category;
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
        System.out.println(category + ":");
        for (Food food : foods) {
            System.out.println("- " + food);
        }
    }
}
