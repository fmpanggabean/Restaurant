package restaurant;

import java.text.NumberFormat;
import java.util.*;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
    private String name;
    private List<Chef> chefs = new ArrayList<>();
    private List<Menu> menus = new ArrayList<>();
    private int totalPrice;

    public Restaurant(String name) {
        this.name = name;
        System.out.println("====================");
        System.out.println("|   " + name + "   |");
        System.out.println("====================\n");
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("===== MENU in " + name + " =====");
        for (Menu menu : menus) {
            System.out.println("  [ " + menu.getMenu() + " ]");
            for (Food food : menu.getFoods()) {
                System.out.println("    - " + food.getName() + " : " + formatIDR(food.getPrice()));
            }
            System.out.println();
        }
    }

    public void showChef() {
        System.out.println("===== CHEFS in " + name + " =====");
        for (Chef chef : chefs) {
            System.out.println("  - " + chef.getName());
        }
        System.out.println("\n========== Buyers Transactions ==========");
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            Food food = menu.getFood(foodName);
            if (food != null) {
                int price = food.getPrice() * quantity;
                visitor.addPrice(price);
                chef.addHistory(foodName, quantity);
                totalPrice += price;
                System.out.println(visitor.getName() + " bought " + quantity + " " + foodName + " from " + chef.getName());
                return;
            }
        }
        System.out.println("Food not found: " + foodName);
    }

    public void showTotalIncome() {
        System.out.println("=============================");
        System.out.println("Total income: " + formatIDR(totalPrice));
        System.out.println("=============================");
    }

    public static String formatIDR(int price) {
        @SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatter.format(price);
    }
}