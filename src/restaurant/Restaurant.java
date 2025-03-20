package restaurant;

import java.util.ArrayList;
import people.*;

public class Restaurant {
    private String name;
    private ArrayList<Menu> menus;
    private ArrayList<Chef> chefs;
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
        System.out.println("\n=== MENU RESTORAN " + name + " ===");
        for (Menu menu : menus) {
            menu.show();
        }
    }

    public void showChef() {
        System.out.println("\n=== DAFTAR CHEF ===");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            Food food = menu.getFood(foodName);
            if (food != null) {
                int totalCost = food.getPrice() * quantity;
                visitor.addBill(totalCost);
                chef.cook(foodName, quantity);
                totalIncome += totalCost;
                System.out.println(visitor.getName() + " memesan " + quantity + " " + foodName + " dari Chef " + chef.getName());
                return;
            }
        }
        System.out.println("Menu " + foodName + " tidak ditemukan.");
    }

    public void showTotalIncome() {
        System.out.println("\nTotal pendapatan restoran: Rp " + totalIncome);
    }
}
