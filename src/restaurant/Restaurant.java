package restaurant;

import java.util.ArrayList;
import java.util.List;

import main.Main;
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

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void showMenu() {
        for (Menu menu : menus) {
            System.out.println("Category: " + menu.getCategory());
            for (Food food : menu.getFoods()) {
                System.out.println("- " + food.getName() + ": " + Main.formatIDR(food.getPrice()));
            }
            System.out.println("");
        }
    }

    public void showChef() {
        System.out.println("Chefs at " + name + ":");
        for (Chef chef : chefs) {
            System.out.println("	- " + chef.getName());
        }
        System.out.println("");
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if (food.getName().equals(foodName)) {
                    double totalPrice = food.getPrice() * quantity;
                    visitor.addToBill((int) totalPrice);
                    chef.addToCookHistory(foodName, quantity);
                    totalIncome += totalPrice;
                    return;
                }
            }
        }
        System.out.println("Food not found: " + foodName);
    }

    public void showTotalIncome() {
        System.out.println("Total Income: " + Main.formatIDR(totalIncome));
    }
}