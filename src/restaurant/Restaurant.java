package restaurant;

import java.util.ArrayList;
import people.Chef;
import people.Visitor;
import main.Helper;

public class Restaurant {
    private String name;
    private ArrayList<Chef> chefs = new ArrayList<>();
    private ArrayList<Menu> menus = new ArrayList<>();
    private int totalIncome = 0;

    public Restaurant(String name) {
        this.name = name;
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void order(Chef chef, Visitor visitor, String name, int qty){
        for(Menu menu : menus){
            for(Food food : menu.getFoods()){
                if(food.getName().equals(name)){
                    int price = food.getPrice() * qty;
                    totalIncome += price;
                    visitor.setTotalPrice(visitor.getTotalPrice() + price);
                    break;
                }
            }
        }
        chef.addCookHistory("Cooked " + name +" for "+ visitor.getName() + " " + qty + " pcs");
    }

    public void showMenu(){
        System.out.println(name + "'s Menu:");
        for(Menu menu : menus){
            System.out.println("Menu: " + menu.getName());
            for(Food food : menu.getFoods()){
                System.out.println("	-" + food.getName() + ", Price: " + Helper.formatIDR(food.getPrice()));
            }
        }
        System.out.println();
    }

    public void showChef(){
        System.out.println(name + "'s Chefs:");
        for(Chef chef : chefs){
            System.out.println("	-Chef " + chef.getName());
        }
        System.out.println();
    }
    
    public void showTotalIncome(){
        System.out.println("\nTotal Income: " + Helper.formatIDR(totalIncome));
    }
}
