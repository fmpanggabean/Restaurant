package restaurant;

import java.util.ArrayList;
import java.util.List;

import people.Chef;
import people.Visitor;
import main.currHelper;

public class Restaurant {
    private String name;
    private List<Chef> chefs = new ArrayList<>();
    private List<Menu> menus = new ArrayList<>();
    private int totalIncome = 0;
    
	public Restaurant(String name) {
		this.name = name; 
	}
	
    public String getName() {
		return name;
	}

	public List<Chef> getChefs() {
		return chefs;
	}

	public List<Menu> getMenus() {
		return menus;
	}
    
    public void showChef() {
		System.out.println("=== Daftar Chef ===");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
        System.out.println();
    }
    
    public int getTotalIncome() {
		return totalIncome;
	}
	
	public void showMenu(){
		System.out.println("Selamat datang di Rumah Sambal");
		System.out.println("\n=== Menu di " + name + " ===");
        for(Menu menu : menus){
            System.out.println("Menu - " + menu.getName() + ":");
            for(Food food : menu.getFoods()){
                System.out.println("  -" + food.getName() + ", Price: " + currHelper.formatIDR(food.getPrice()));
            }
            System.out.println();
        }
    }
    
    public void addChef(Chef chef) {
        chefs.add(chef);
    }
    
    public void addMenu(Menu menu) {
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
        chef.addCookHistory("Memasak " + qty + " " + name +" untuk "+ visitor.getName());
    }
    
    public void showTotalIncome() {
    	System.out.println();
        System.out.println("Total Pendapatan Untuk " + name + " is:" + currHelper.formatIDR(totalIncome));
    }

    
}
