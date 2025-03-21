package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private int totalIncome;
	private ArrayList<Menu> menus;
	private ArrayList<Chef> chefs;
	
	public Restaurant(String name) {
		this.name = name;
		this.menus = new ArrayList<>();
		this.chefs = new ArrayList<>();
	}

	public void addMenu(Menu menu) {
		this.menus.add(menu);
	}
	
	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	
	public void showMenu() {
		System.out.println();
		System.out.println("-- " + this.name + "'s MENU --");
		int numMenu = 1;
		for (Menu m : menus) {
			System.out.println(numMenu++ + ". " + m.getType() + ":");
			for (Food f : m.getFoods()) {
				System.out.println("  - " + f.getName() + " (" + formatIDR(f.getPrice()) +")");
			}
		}
	}

	public void showChef() {
		System.out.println();
		System.out.println("-- " + this.name + "'s CHEF --");
		for (Chef c : chefs) {
			System.out.println("Chef " + c.getName());
		}
 	}

	public void order(Chef chef, Visitor visitor, String food, int quantity) {
		System.out.println();
		Food foodOrdered = null;
		for (Menu m : menus) {
			for (Food f : m.getFoods()) {
				if (f.getName().equalsIgnoreCase(food)) {
					foodOrdered = f;
				}
			}
		}
		if (foodOrdered != null) {
			visitor.setTotalPrice(visitor.getTotalPrice() + quantity*foodOrdered.getPrice());
			chef.addCookHistory(foodOrdered);
			this.totalIncome += quantity * foodOrdered.getPrice();
			System.out.println("Mr/Ms. " + visitor.getName() + " ordered " + quantity + " " + food + "!");
		} else {
			System.out.println("There is no " + food + "in the restaurant...");
			return;
		}
		Integer qtyBefore = chef.getNumberCooked().get(foodOrdered);
		chef.setNumberCooked(foodOrdered, qtyBefore == null ? quantity : qtyBefore + quantity);
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println(this.name + "'s Total Income : " + formatIDR(this.totalIncome));
	}
	
	public static String formatIDR(int amount) { 

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        return formatter.format(amount); 

    } 

	
}
