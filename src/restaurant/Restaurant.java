package restaurant;

import people.Chef;
import people.Visitor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.*;

public class Restaurant {
	private String name;
	private List<Menu> menus;
	private List<Chef> chefs;
	private int totalIncome;

	public Restaurant(String name) {
		this.name = name;
		this.menus = new ArrayList<>();
		this.chefs = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
	    System.out.println("========================================================");
	    System.out.printf("\t\tWelcome To %-20s\t\t\n", name);
	    System.out.println("========================================================");
	    System.out.println("\n# Menu List:");
	    
	    for (Menu menu : menus) {
	        int i = 0;
	        System.out.println("=================================================");
	        System.out.println("Type: " + menu.getType());
	        System.out.println("-------------------------------------------------");
	        System.out.printf("%-5s %-25s %-15s\n", "No", "Nama Makanan", "Harga");
	        System.out.println("-------------------------------------------------");
	        for (Food food : menu.getFoods()) {
	            i++;
	            System.out.printf("%-5d %-25s %-15s\n", i, food.getName(), formatIDR(food.getPrice()));
	        }
	        System.out.println("=================================================");
	        System.out.println();
	    }
	}


	public void showChef() {
		System.out.println("=================================================");
		System.out.println("# Chefs at "+name+":");
		System.out.println("=================================================");
        for (Chef chef : chefs) {
            System.out.println(" - Chef " + chef.getName());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("\n=================================================");
        System.out.println("# Transactions:");
        System.out.println("=================================================");
	}

	public void order(Chef chef, Visitor visitor, String name, int quantity) {
		Food food = isFoodExist(name);
		
		if(food == null) {
			System.out.println("Food not found!");
			return;
			
		} else {
			int price = food.getPrice() * quantity;
			visitor.setTotalPrice(price);
			totalIncome += price;
			
			chef.addHistory(food, quantity);
			
			System.out.println(" - "+visitor.getName() + " is ordering " + quantity + " portion of " + food.getName() + " by Chef " + chef.getName());
		}
	}
	
	private Food isFoodExist(String name) {
		for(Menu menu: menus) {
			for(Food food: menu.getFoods()) {
				if(food.getName().equalsIgnoreCase(name)) return food;
			}
		}
		return null;
	}

	public void showTotalIncome() {
		System.out.println("\n========================================================");
		System.out.println(" Total Restaurant Income: "+formatIDR(totalIncome));
		System.out.println("========================================================");
	}
	
	public static String formatIDR(int amount) { 
		@SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
	    return formatter.format(amount);
	}

	
	
}
