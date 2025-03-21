package restaurant;

import java.util.ArrayList;

import main.Main;
import people.Chef;
import people.Visitor;

public class Restaurant {
    private String name;
    private ArrayList<Chef> chefs;
    private ArrayList<Menu> menus;
    private int totalIncome;

    public Restaurant(String name) {
        this.name = name;
        this.chefs = new ArrayList<>();
        this.menus = new ArrayList<>();
        this.totalIncome = 0;
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("Menu at " + name + ":");
        for (Menu menu : menus) {
            menu.showItems();
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
            Food food = menu.getFood(foodName);
            if (food != null) {
                int totalPrice = food.getPrice() * quantity;
                visitor.addToTotalPrice(totalPrice);
                chef.addCookHistory(foodName, quantity);
                totalIncome += totalPrice;
                System.out.println(visitor.getName() + " ordered " + quantity + " " + foodName + " prepared by " + chef.getName());
                return;
            }
        }
        System.out.println("Food " + foodName + " not found in the menu.");
    }

    public void showTotalIncome() {
        System.out.println("Total income of " + name + ": " + Main.formatIDR(totalIncome));
    }
}

