package restaurant;

import people.Chef;
import people.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Menu> menus = new ArrayList<>();
    private List<Chef> chefs = new ArrayList<>();
    private int totalIncome;

    public Restaurant(String name) {
        this.name = name;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }
    public void addChef(Chef chef){
        chefs.add(chef);
    }
   public void order(Chef chef, Visitor visitor, String string, int qty) {
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if (food.getName().equals(string)) {
                    System.out.println(visitor.getName() + " ordered " + food.getName() + " to Chef " + chef.getName());
                    System.out.println("Quantity: " + qty);
                    System.out.println("Total price: " + food.getPrice() * qty);
                    visitor.addExpense(food.getPrice() * qty);
                    totalIncome += food.getPrice() * qty;
                    chef.addOrder(food.getName(), qty);
                }
            }
        }
    }
    public void showMenu() {
        System.out.println("Menus:");
        for (Menu menu : menus) {
            System.out.println(menu.getName()+":");
            for (Food food : menu.getFoods()) {
                System.out.println(food.getName() + " - " + food.getPrice());
            }
        }
    }
    public void showChef(){
        System.out.println("Chefs:");
        for (Chef chef : chefs) {
            System.out.println(chef.getName());

        }
    }
    public void showTotalIncome(){
        System.out.println("Total income: " + totalIncome);
    }
    public List<Menu> getMenus() {
        return menus;
    }
    public String getName() {
        return name;
    }

}
