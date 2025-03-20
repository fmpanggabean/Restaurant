package restaurant;

import java.util.ArrayList;
import java.text.NumberFormat; 
import java.util.Locale;

import people.Chef;
import people.Visitor; 

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int income = 0;
	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void showMenu() {
		System.out.println("Restourant: " + name);
		System.out.println();
		System.out.println("Menus:");
		for (Menu menu : menus) {
			System.out.println("- " + menu.getName());
			for (Food food : menu.getFoods()) {
				System.out.println("  Name: " + food.getName() + ", Price: " + formatIDR(food.getPrice()));
			}
			System.out.println();
		}
	}
	
	public static String formatIDR(int amount) { 

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        return formatter.format(amount); 

    }

	public void showChef() {
		System.out.println("Chefs:");
		for (Chef chef : chefs) {
			System.out.println("Name: " + chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String menuName, int quantity) {
		String history = menuName + ", Quantity: " + quantity;
		
		int flag = 0;
		
		for (Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName().equals(menuName)) {
					flag = 1;
					int amount = visitor.getAmount();
					int total = quantity * food.getPrice();
					visitor.setAmount( amount + total);
					income += total;
					break;
				}
			}
			if(flag == 1) break;
		}
		if(flag == 1) {
			chef.addHistory(history);
		}else {
			System.out.println("Menu no register");
		}
		
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println(name +", Total Income: " + formatIDR(income));
	} 
	
}
