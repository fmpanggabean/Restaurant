package restaurant;

import java.util.*;

public class Menu {
    private String category;
    private List<Food>foods = new ArrayList<>();


    public Menu(String category){
        this.category=category;
    }

    public void add(Food food){
        foods.add(food);
    }

    public void showMenu(){
        System.out.println("\n" + category + " Menu:");
        for (Food food : foods) {
            System.out.println("- " + food.getName() + " : Rp " + food.getPrice());
        }
    }

    public Food getFoodByName(String name) {
        for (Food food : foods) {
            if (food.getName().equals(name)) {
                return food;
            }
        }
        return null;
    }




}
