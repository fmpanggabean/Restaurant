package restaurant;

import java.util.ArrayList;
import main.Main;

public class Menu {
    private String category;
    private ArrayList<Food> foods;

    public Menu(String category) {
        this.category = category;
        this.foods = new ArrayList<>();
    }

    public void addFood(Food food) { 
        foods.add(food);
    }

    public void showItems() {
        System.out.println(category + " Menu:");
        for (Food food : foods) {
            System.out.println("- " + food.getName() + " : " + Main.formatIDR(food.getPrice()));
        }
    }

    public Food getFood(String foodName) {
        for (Food food : foods) {
            if (food.getName().equals(foodName)) {
                return food;
            }
        }
        return null;
    }

    public String toString() {
        return "Menu{category='" + category + "', foods=" + foods + "}";
    }

    public void add(Food food) {
        foods.add(food);
    }

}
