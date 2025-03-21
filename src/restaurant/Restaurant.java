package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.Visitor;
import people.Chef;
import main.Food;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int totalIncome = 0;
	
	public Restaurant(String name) {
		this.name = name;
	}

	public void addMenu(Menu menu) {
		this.menus.add(menu);
	}
	
	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	
	public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 
    } 
	
	public void showMenu() {
		System.out.println("Welcome to " + this.name);
		System.out.println();
		
		System.out.println("=== Menu ===");
		for (Menu menu : menus) {
			System.out.println(menu.getMenu() + " Menu");
			for (Food food : menu.getFood()) {
				System.out.println("- " + food.getName() + " : " + formatIDR(food.getPrice()));
			}
			System.out.println();
		}
	}

	public void showChef() {
		System.out.println("=== Chef ===");
		for (Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
		System.out.println();
	}
	
	public void order(Chef chef, Visitor visitor, String name, int quantity) {
		int price = 0;
		
		for (Menu menu : menus) {
            for (Food food : menu.getFood()) {
                if (food.getName().equals(name)) {
                    price = food.getPrice();
                }
            }
        }
		
		chef.cook(name, quantity);
		visitor.orderFood(name, quantity, price);
		totalIncome += price*quantity;
	}

	public void showTotalIncome() {
		System.out.println("\nTotal income: " + formatIDR(totalIncome));
	}

}
