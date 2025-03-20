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
    	int i = 1;
        for(Menu menu : menus){
            System.out.println("Menu : " +  menu.getName());
            System.out.println("------------------");
            for (Food food : menu.getFoods()){
                System.out.println(i + ". Menu : " + food.getName() + "| | Price : " + food.getPrice());
                i++;
            }
            System.out.println("----------------------");
            i = 1;
        }
    }

    public void showChef(){
        System.out.println("Chef: ");
        for(Chef chef : chefs){
            System.out.println("Name : " + chef.getName());
        }
        System.out.println("----------------------");
    }

    public void setTotalIncome(int foodPrice){
        totalIncome += foodPrice;
    }

    public void order(Chef chef, Visitor visitor, String name, int many){
        int Price = 0;
        for(Menu menu : menus){
            for (Food food : menu.getFoods()){
                if(food.getName().equals(name)){
                    Price = food.getPrice();
                    Price *= many;
                    break;
                }
            }
        }
        visitor.getTotalPrice(Price);
        visitor.addOrder(name, many);
        chef.addOrder(name, many);
        setTotalIncome(Price);
    }

    public void showTotalIncome(){
        System.out.println("total income : " + totalIncome);
    }
}