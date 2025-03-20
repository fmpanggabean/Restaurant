package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<Food> items;

    public Menu(String category) {
        this.category = category;
        this.items = new ArrayList<>();
    }

    public void add(Food food) {
        items.add(food);
    }

    public void showItems() {
        System.out.println("Kategori: " + category);
        for (Food food : items) {
            System.out.println("- " + food.getName() + " : Rp " + food.getPrice());
        }
    }

    public Food getFood(String name) {
        for (Food food : items) {
            if (food.getName().equalsIgnoreCase(name)) {
                return food;
            }
        }
        return null;
    }
}