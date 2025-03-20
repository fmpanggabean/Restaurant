package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<>();
	private ArrayList<Chef> chefs = new ArrayList<>();
	private int totalIncome;
	

	public Restaurant(String name) {
		this.name = name;
	}


	public void addMenu(Menu menu) {
		menus.add(menu);

	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	

	public void showMenu() {
		System.out.println("-- " + name + " Restaurant --");
		for(Menu menu : menus) {
			System.out.println("Menu : " + menu.getName());
			for(Food food : menu.getFoods()) {
				System.out.println("- " + food.getName() + " (" + formatIDR(food.getPrice()) + ")");
			}
			System.out.println();
		}
		
	}

	public void showChef() {
		System.out.println("Chefs : ");
		for(Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
		System.out.println();
		
	}

	public void order(Chef chef, Visitor visitor, String name, int quantity) {
		for(Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName().equals(name)) {
					int price = food.getPrice() * quantity;
					visitor.addTotalPrice(price);
					chef.addCookHistory(name);
					totalIncome += price;
					System.out.println("Chef " + chef.getName() + " is cooking " + quantity + " " + food.getName() + " for " + visitor.getName());
				}
			}
		}
	}

	public void showTotalIncome() {
		System.out.println("Total Income : " + formatIDR(totalIncome));
		
	}

	public static String formatIDR(int amount) { 
        @SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 

    } 



}
