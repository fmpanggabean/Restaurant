package restaurant;

import java.util.ArrayList;
import java.util.List;
import people.Chef;
import people.Visitor;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void showMenu() {
        System.out.println("Menu of " + name + ":");
        for (Menu menu : menus) {
            System.out.println(menu.getName() + ":");
            for (Food food : menu.getFoods()) {
                System.out.println("- " + food.getName() + " (" + food.getPrice() + ")");
            }
        }
    }

    public void showChef() {
        System.out.println("Chefs at " + name + ":");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if (food.getName().equalsIgnoreCase(foodName)) {
                    visitor.addOrder(food.getName(), food.getPrice(), quantity);
                    chef.addCookHistory(food.getName(), quantity);
                    totalIncome += food.getPrice() * quantity;
                    return;
                }
            }
        }
        System.out.println("Food " + foodName + " is not available.");
    }

    public void showTotalIncome() {
        System.out.println("Total Income: " + totalIncome);
    }
}
