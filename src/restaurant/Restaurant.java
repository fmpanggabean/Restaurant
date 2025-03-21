package restaurant;

import java.util.*;


import people.*;

public class Restaurant {
    private String name;
    private List<Chef> chefs = new ArrayList<>();
    private List<Menu> menus = new ArrayList<>();
    private int totalIncome;

    public Restaurant(String name) {
        this.name = name;
        this.totalIncome = 0;
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("Menu di " + name + ":");
        for (Menu menu : menus) {
            menu.showMenu();
        }
    }

    public void showChef() {
        System.out.println("Chef di " + name + ":");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            Food food = menu.getFood(foodName);
            if (food != null) {
                int cost = food.getPrice() * quantity;
                visitor.addTotalCost(cost);
                chef.cook(foodName, quantity);
                totalIncome += cost;
                System.out.println(visitor.getName() + " memesan " + quantity + " " + foodName + " dari Chef " + chef.getName());
                return;
            }
        }
        System.out.println("Menu " + foodName + " tidak tersedia.");
    }

    public void showTotalIncome() {
        System.out.println("Total pendapatan restoran: " + totalIncome);
    }
}
