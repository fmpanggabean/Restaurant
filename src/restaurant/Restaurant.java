package restaurant;

import main.*;
import people.*;

import java.util.*;

public class Restaurant {

    private String name;
    private double total_income;
    private List<Chef> chefs = new ArrayList<>();
    private List<Menu> menus = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal_income() {
        return total_income;
    }

    public void setTotal_income(int total_income) {
        this.total_income = total_income;
    }

    public List<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(List<Chef> chefs) {
        this.chefs = chefs;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println(name + "'s Available Menus:");
        for (Menu menu : menus) {
            System.out.println(menu.getName() + "'s Foods:");
            for (Food food : menu.getFoods()) {
                System.out.println("- Name: " + food.getName() + ", Price: " + Main.formatRupiah(food.getPrice()));
            }

            System.out.println();
        }
    }

    public void showChef() {
        System.out.println(name + "'s Available Chefs:");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }

        System.out.println();
    }

    public Food searchFood(String name) {
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if (name.equals(food.getName())) return food;
            }
        }

        return null;
    }

    public void order(Chef chef, Visitor visitor, String name, int qty) {
        Food ordered_food = searchFood(name);
        double price = ordered_food.getPrice() * qty;

        total_income += price;
        visitor.addTotal_Price(price);

        chef.addCooking_history(qty, name, visitor, price);
    }

    public void showTotalIncome() {
        System.out.println(name + " got revenue " + Main.formatRupiah(total_income));
    }
}
