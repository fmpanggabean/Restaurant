package restaurant;

import java.util.ArrayList;
import people.Chef;
import people.Visitor;

public class Restaurant {
    private String name;
    private ArrayList<Chef> chefs = new ArrayList<>();
    private ArrayList<Menu> menus = new ArrayList<>();
    private ArrayList<order> orders = new ArrayList<>();
    private int income = 0;

    public Restaurant(String name) {
        this.name = name;
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("Restaurant Menu:");
        for (Menu menu : menus) {
            System.out.println("  " + menu.getType() + ":");
            for (Food food : menu.getFoods()) {
                System.out.println("   - " + food.getName() + " (Rp" + food.getPrice() + ")");
            }
        }
        System.out.println();
    }

    public void showChef() {
        System.out.println("Chefs:");
        for (Chef chef : chefs) {
            System.out.println("   - " + chef.getName());
        }
        System.out.println();
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if (food.getName().equals(foodName)) {
                    int totalPrice = food.getPrice() * quantity;
                    visitor.addPrice(totalPrice);
                    income += totalPrice;
                    orders.add(new order(chef, visitor, foodName, quantity));
                    chef.addCookHistory(foodName, quantity);
                    return;
                }
            }
        }
        System.out.println("Food " + foodName + " not found in menu.");
    }

    public void showTotalIncome() {
        System.out.println("Restaurant Income: Rp" + income);
    }
}
