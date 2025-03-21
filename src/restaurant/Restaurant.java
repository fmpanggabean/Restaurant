package restaurant;

import java.util.*;

import people.*;

public class Restaurant {
    private String name;
    List<Chef> chefs = new ArrayList<>();
    List<Menu> menus = new ArrayList<>();
    int total = 0;

    public Restaurant(String nama){
        this.name = nama;
    }

    public String getName(){
        return name;
    }

    public void add(Chef chef){
        chefs.add(chef);
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void showMenu(){
        System.out.println("Restaurant : " + name);
        System.out.println("Menus : ");
        for(Menu menu : menus){
            menu.showMenu();
        }
        System.out.println("");
    }

    public void showChef(){
        System.out.println("Chefs : ");
        for(Chef chef : chefs){
            System.out.println(chef);
        }
        System.out.println("");
    }

    public void order(Chef chef, Visitor visitor, String foodName, int quantity){
        for(Menu menu : menus){
            for(int i = 0; i < menu.getFoodNames().size(); i++){
                if (menu.getFoodNames().get(i).equals(foodName)) {
                    int price = menu.getFoodPrices().get(i);
                    visitor.order(foodName, quantity, price);
                    chef.cook(foodName, quantity);
                    total += price * quantity;
                    return;
                }
            }
        }
    }

    public void showTotalIncome(){
        System.out.println("Total Income Restaurant : " + total);
    }
}
