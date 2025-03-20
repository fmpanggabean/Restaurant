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

    public Food getFood(String foodName) {
        for (Food food : foods) {
            if (food.getName().equals(foodName)) {
                return food;
            }
        }
        return null;
    }

    public void showMenu() {
        System.out.println(name + ":");
        for (Food food : foods) {
            System.out.println(food.getName() + " - " + food.getPrice());
        }
    }
}