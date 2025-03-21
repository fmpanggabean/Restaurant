package restaurant;

import java.util.*;
import people.Chef;
import people.Visitor;

public class Restaurant {
    private final String name;
    private final List<Menu> menus;
    private final List<Chef> chefs;
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
        System.out.println("Menu di " + name + ":");
        for (Menu menu : menus) {
            System.out.println("\n" + menu.getType() + ":");
            for (Food food : menu.getFoods()) {
                System.out.println(food.getName() + " - Rp " + food.getPrice());
            }
        }
    }

    public void showChef() {
        System.out.println("\nDaftar Chef:");
        for (Chef chef : chefs) {
            System.out.println(chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if (food.getName().equals(foodName)) {
                    int price = food.getPrice() * quantity;
                    visitor.addToTotal(price);
                    totalIncome += price;
                    chef.addCookHistory(visitor.getName(), foodName, quantity);
                    System.out.println(visitor.getName() + " memesan " + quantity + " " + foodName + " dari " + chef.getName());
                    return;
                }
            }
        }
        System.out.println("Makanan " + foodName + " tidak ditemukan di menu.");
    }

    public void showTotalIncome() {
        System.out.println("Total pendapatan restoran: Rp " + totalIncome);
    }

    
}
