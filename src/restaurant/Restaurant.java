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

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void showMenu() {
        System.out.println("Menu di " + name + ":");
        for (Menu menu : menus) {
            menu.showItems();
        }
    }

    public void showChef() {
        System.out.println("Daftar Chef di " + name + ":");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            Food food = menu.getFood(foodName);
            if (food != null) {
                int cost = food.getPrice() * quantity;
                visitor.addToBill(cost);
                chef.cook(foodName, quantity);
                totalIncome += cost;
                System.out.println(visitor.getName() + " memesan " + quantity + " " + foodName + " dari " + chef.getName());
                return;
            }
        }
        System.out.println("Makanan " + foodName + " tidak ditemukan.");
    }

    public void showTotalIncome() {
        System.out.println("Total pendapatan restoran: Rp " + totalIncome);
    }
}