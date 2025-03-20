package restaurant;

import main.Food;

import java.util.ArrayList;

public class Menu {
    private String name;
    private ArrayList<Food> items = new ArrayList<>();
    
    public Menu (String name){
        this.name = name;
    }

    public void addItems(Food food){
        items.add(food);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getItems() {
        return items;
    }

    public void displayItems(){
        for (Food f : items){
            System.out.printf("  Name : %s, Price : %d\n", f.getName(), f.getPrice());
        }
        System.out.println("=====================================");
    }
}
