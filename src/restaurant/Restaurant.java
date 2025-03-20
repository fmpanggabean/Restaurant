package restaurant;

import main.Food;
import people.Chef;
import people.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Menu> menus;
    private List<Chef> chefs;
    private int totalIncome;

    public Restaurant(String name) {
        this.name = name;
        this.menus = new ArrayList<>();
        this.chefs = new ArrayList<>();
        this.totalIncome = 0;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void showMenu() {
        System.out.println("\n--- Menu " + name + " ---");
        for (Menu menu : menus) {
            menu.showMenu();
        }
    }

    public void showChef() {
        System.out.println("--- Chefs ---");
        for (Chef chef : chefs) {
            System.out.println(chef.getName());
        }
        System.out.println();
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        Food food = findFood(foodName);
        if (food != null) {
            int cost = food.getPrice() * quantity;
            visitor.addToBill(cost);
            chef.cook(foodName, quantity);
            totalIncome += cost;
        } else {
            System.out.println("Food not found: " + foodName);
        }
    }

    private Food findFood(String foodName) {
        for (Menu menu : menus) {
            Food food = menu.getFood(foodName);
            if (food != null) return food;
        }
        return null;
    }

    public void showTotalIncome() {
        System.out.println("\nTotal income: Rp" + totalIncome);
    }
}
