package restaurant;

import java.util.*;

import people.Chef;
import people.Visitor;

public class Restaurant {
    String name;
    int totalIncome = 0;
    List <Menu> menus = new ArrayList<>();
    List <Chef> chefs = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addChef(Chef chef){
        chefs.add(chef);
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void showMenu(){
        for(Menu menu : menus){
            System.out.printf("Menu : %s\n", menu.getName());
            System.out.println("=================");
            for (Food food : menu.getFoods()){
                System.out.printf("Menu : %s, Price : %d\n", food.getName(), food.getPrice());
            }
            System.out.println("======================");
        }
    }

    public void showChef(){
        System.out.println("Chef: ");
        for(Chef chef : chefs){
            System.out.printf("Name : %s\n", chef.getName());
        }
        System.out.println("======================");
    }

    public void setTotalIncome(int foodPrice){
        totalIncome += foodPrice;
    }

    public void order(Chef chef, Visitor visitor, String name, int quant){
        int foodPrice = 0;
        for(Menu menu : menus){
            for (Food food : menu.getFoods()){
                if(food.getName().equals(name)){
                    foodPrice = food.getPrice();
                    foodPrice *= quant;
                    break;
                }
            }
        }
        visitor.totalingPrice(foodPrice);
        visitor.addOrder(name, quant);
        chef.addOrder(name, quant);
        setTotalIncome(foodPrice);
    }

    public void showTotalIncome(){
        System.out.printf("%s's total income : %d\n", name, totalIncome);
    }
}
