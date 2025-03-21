package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private List<Chef> chefs = new ArrayList<>();
	private List<Menu> menus = new ArrayList<>();
	private int totalIncome = 0;

	public Restaurant(String name) {
		this.name = name;
		System.out.println("Restaurant \"" + name + "\" is open now!\n");
	}

	public void addChef(Chef chef) {
		chefs.add(chef);	
		System.out.println("<" + chef.getName() + ">" + " is hired as a chef at " + name);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		System.out.println("[" + menu.getName() + "] section is now available at " + name);
	}

	public void showMenu() {
		System.out.println("\nAvailable menus at " + name + ":");
		for(Menu menu : menus) {
			System.out.println(" -[" + menu.getName() + "]");
			menu.showFoods();
		}
	
	}

	public void showChef() {
		System.out.println("\nAvailable chefs at " + name + ":");
		for(Chef chef : chefs) {
			System.out.println(" -<" + chef.getName() + ">");
			if(chef.equals(chefs.get(chefs.size()-1))) {
				System.out.println("");
			}
		}
		
	}

	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		String cookHistory = "Cooked " + quantity + " of " + foodName + " for " + visitor.getName() + " (Income: " + formatIDR(quantity*findFood(foodName).getPrice()) + ")";
		chef.addCookHistory(cookHistory);
		visitor.setTotalPrice(quantity*findFood(foodName).getPrice());
		totalIncome += quantity*findFood(foodName).getPrice();
	}

	private Food findFood(String foodName) {
		Food search = null;
		for(Menu menu : menus) {
			search = menu.getFood(foodName);
			if(search != null) {
				return search;
			}
		}
		return null;
	}

	public void showTotalIncome() {
		System.out.println("\nRestaurant \"" + name + "\" total income: " + formatIDR(totalIncome));
		
	}
	
	public static String formatIDR(int amount) { 
   	 	NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.of("id", "ID")); 
        return formatter.format(amount); 
    } 

}
