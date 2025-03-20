package restaurant;

import java.util.ArrayList;
import java.util.List;

import people.Chef;
import people.Visitor;

public class Restaurant {
    private String name;
    private List<Menu> menus = new ArrayList<>();
    private List<Chef> chefs = new ArrayList<>();
    private int totalIncome = 0;

    public Restaurant(String name) {
        this.name = name;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("Menu at " + name + ":");
        for (Menu menu : menus) {
            menu.showMenu();
        }
    }

    public void showChef() {
        System.out.println("Chefs at " + name + ":");
        for (Chef chef : chefs) {
            System.out.println(chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menus) {
            Food food = menu.getFood(foodName);
            if (food != null) {
                int price = food.getPrice() * quantity;
                visitor.addToTotalPrice(price);
                chef.addCookHistory(foodName, quantity);
                totalIncome += price;
                return;
            }
        }
        System.out.println("Food not found: " + foodName);
    }

    public void showTotalIncome() {
        System.out.println("Total income: " + totalIncome);
    }
}