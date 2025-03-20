package restaurant;

import java.util.*;

import people.Chef;
import people.Visitor;

public class Restaurant {
    private String name;
    private List<Menu> menus = new ArrayList<>();
    private List<Chef> chefs = new ArrayList<>();
    private int totalIncome;

    public Restaurant(String name) {
        this.name = name;
        this.totalIncome = 0;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("\nWelcome to " + name);
        for (Menu menu : menus) {
            menu.showMenu();
        }
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void showChef() {
        System.out.println("\nChefs:");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            Food food = menu.getFoodByName(foodName);
            if (food != null) {
                int totalPrice = food.getPrice() * quantity;
                visitor.addToTotalPrice(totalPrice);
                String history = chef.getName() + " cook" + foodName;
                chef.addCookHistory(history);
                totalIncome += totalPrice;
                System.out.println(visitor.getName() + " ordered " + quantity + " " + foodName + " from " + chef.getName());
                return;
            }
        }
        System.out.println("Food not found: " + foodName);
    }

    public void showTotalIncome() {
        System.out.println("\nTotal Income: Rp " + totalIncome);
    }
}

