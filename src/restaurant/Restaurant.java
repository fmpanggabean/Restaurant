package restaurant;

import java.util.*;
import main.*;
import people.*;

public class Restaurant {
    public String name;
    public Integer totalIncome = 0;
    public static ArrayList<Chef> chefs = new ArrayList<>();
    public ArrayList<Menu> menus = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;   
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("\nMenu at " + name);
        for (Menu menu : menus) {
            System.out.println("=====" + menu.type + "=====");
            for (Food food : menu.foods) {
                System.out.println(food.name + " - " + Main.formatIDR(food.price));
            }
        }
        System.out.println("===================================");
    }

    public void showChef() {
        int i = 1;
        System.out.println("Chef at " + name);
        for (Chef chef : chefs) {
            System.out.println(i++ + ". " + chef.name);
        }
        System.out.println("===================================");
    }

    public void order(Chef chef, Visitor visitor, String food_name, Integer quantity ) {
        int flag = 0;
        for (Menu menu : menus) {
            for (Food food : menu.foods) {
                if (food.name.equals(food_name)) {
                    flag = food.price; 
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Food not found");
        } else {
            visitor.totalSpend += (flag * quantity);
            totalIncome += (flag * quantity);
            chef.history_Orders.add(visitor.name + " order " + quantity + " " + food_name);
        }
    }

    public void showTotalIncome() {
        System.out.println("\nTotal income of " + name + " is " + Main.formatIDR(totalIncome));
    }

}
