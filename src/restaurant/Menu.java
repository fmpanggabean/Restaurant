package restaurant;

import java.util.ArrayList;

public class Menu {
    private String category;
    private ArrayList<Food> foods = new ArrayList<>();

    public Menu(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void add(Food food){
        foods.add(food);
    }

    public void showMenu(){
        System.out.println("Category: " + category);
        for(Food food : foods){
            System.out.println(food.getName() + " - Rp " + food.getPrice());
        }
    }
}
