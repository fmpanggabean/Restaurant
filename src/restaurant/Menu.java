package restaurant;

import java.util.ArrayList;

public class Menu {
    private String name;
    private ArrayList<Food> foods;

    public Menu(String name) {
        this.name = name;
        this.foods = new ArrayList<>();
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

    public void show() {
        System.out.println("\n** " + name + " **");
        for (Food food : foods) {
            System.out.println(food.getName() + " - Rp " + food.getPrice());
        }
    }
}
