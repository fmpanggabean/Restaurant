package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
    private String name;
    private ArrayList<Menu> menus = new ArrayList<>();
    private ArrayList<Chef> chefs = new ArrayList<>();
    private int totalIncome;

    public Restaurant(String name){
        System.out.println("Restaurant: " + name);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void addChef(Chef chef){
        chefs.add(chef);
    }

    public void showMenu(){
        System.out.println("Menu: ");
        for (Menu menu : menus){
            System.out.println(menu.getName() + ":");
            for (Food food : menu.getFoods()){
                System.out.println(" - "+ food.getName() + " - Rp " + (int)food.getPrice());
            }
        }
    }

    public void showChef(){
    	System.out.println();
        System.out.println("Chefs: ");
        for (Chef chef : chefs){
            System.out.println(" - " + chef.getName());
        }
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity){
        for (Menu menu : menus){
            for (Food food : menu.getFoods()){
                if (food.getName().equals(foodName)){
                    String history = "Cooked " + quantity + " " + food.getName() + " for " + visitor.getName();
                    chef.addCookHistory(history);
                    visitor.order(food, quantity);
                    totalIncome += food.getPrice()*quantity;
                }
            }
        }

    }

    public void showTotalIncome(){
    	System.out.println();
        System.out.println("Total income: Rp " + totalIncome);
    }
}

