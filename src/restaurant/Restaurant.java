package restaurant;

import people.*;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int totalIncome;
    private ArrayList<Menu> menus = new ArrayList<>();
    private ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
        this.totalIncome = 0;
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void addChef(Chef chef){
        chefs.add(chef);
    }

    public void showMenu(){
        System.out.println(name + "'s Menu: ");
        for (Menu menu : menus){
            menu.showMenu();
        }
        System.out.println();
    }

    public void showChef(){
        System.out.println("Chefs of " + name + ":");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity){
        boolean foodFound = false;
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if(food.getName().equals(foodName)){
                    int totalPrice = food.getPrice() * quantity;
                    visitor.addOrder(totalPrice);
                    chef.addCookHistory(foodName, quantity);
                    totalIncome += totalPrice;
                    System.out.println(visitor.getName() + " ordered " + quantity + " " + food.getName());
                    System.out.println("Total Price: Rp " + totalPrice);
                    foodFound = true;
                }
            }
        }
        if(!foodFound){
            System.out.println(foodName + " not found in Menu");
        }
    }

    public void showTotalIncome(){
        System.out.println("Total Income: Rp " + totalIncome);
    }
}
