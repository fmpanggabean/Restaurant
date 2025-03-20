package restaurant;

import people.Chef;
import people.Visitor;
import main.Food;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Menu> menus = new ArrayList<>();
    private ArrayList<Chef> chefs = new ArrayList<>();
    private int totalIncome;

    public Restaurant (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMenu(Menu menu){
        menus.add(menu);
    }

    public void addChef(Chef chef){
        chefs.add(chef);
    }
    
    public void showMenu(){
        System.out.println("Show Menu :\n");
        for(Menu m : menus){
            System.out.printf("%s\n", m.getName());
            m.displayItems();
        }
    }

    public void showChef(){
        int i = 1;
        System.out.println("Show Chef :\n");
        for(Chef c : chefs){
            System.out.printf("Chef %d: %s\n", i, c.getName());
            i++;
        }
        System.out.println("=====================================");
    }

    public void order(Chef chef, Visitor visitor, String menuName, int totalItem){
        int price = 0;
        boolean found = false;
        for(Menu m : menus){
            if (found) break;
            for(Food f : m.getItems()){
                if (found) break;
                if (f.getName().equals(menuName)){
                    price = f.getPrice();
                }
            }
        }
        System.out.println("Order :\n");
        System.out.printf("Chef : %s\n", chef.getName());
        System.out.printf("Customer : %s\n", visitor.getName());
        System.out.printf("Items : %s, Quantity : %d\n", menuName, totalItem);
        System.out.printf("Total Price : %d x %d = %d\n", price, totalItem, price*totalItem);

        visitor.addTotalSpent(price * totalItem);
        chef.addHistory(menuName + " " + totalItem);

        totalIncome += price * totalItem;
        System.out.println("=====================================");
    }

    public void showTotalIncome(){
        System.out.println("Show Total Income :\n");
        System.out.printf("Total Income : %d\n",totalIncome);
        System.out.println("=====================================");
    }

}
