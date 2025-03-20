package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private int totalIncome = 0;
	ArrayList<Chef> chefs = new ArrayList<Chef>();
	ArrayList<Menu> menus = new ArrayList<Menu>();
	
	public Restaurant(String name) {
		this.name = name;
		System.out.println();
		System.out.println("| Restaurant: " + name + " |");
		System.out.println();
	}
	
	public String getName() {
		return name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);		
	}

	public void addMenu(Menu menu) {
		menus.add(menu);		
	}

	public void showMenu() {
		System.out.println("+-------+");
		System.out.println("| Menus |");
		System.out.println("+-------+");

		for(Menu menu : menus) {
			System.out.println("  - Menu: " + menu.getName());
			for(Food food : menu.getFoods()) {
				System.out.println("      Food: " + food.getName() + ", " + "Price: " + Restaurant.formatIDR(food.getPrice()));
			}
			System.out.println();
		}
		
	}

	public void showChef() {
		System.out.println("+-------+");
		System.out.println("| Chefs |");
		System.out.println("+-------+");
		
		for(Chef chef : chefs) {
			System.out.println("  - Name: " + chef.getName());
		}
		
		System.out.println("");
		
	}

	public void order(Chef chef, Visitor visitor, String food, int qty) {
		for(Menu menu : menus) {
			for(Food data : menu.getFoods()) {
				if(data.getName() == food) {
					this.totalIncome= this.totalIncome + data.getPrice()*qty; 
					chef.addHistory(data, qty);
					visitor.addTotalPrice(data.getPrice());
				}
			}
		}	
	}
	
    public static String formatIDR(int amount) { 
        @SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 
    }

	public void showTotalIncome() {
		System.out.println();
		System.out.println(name + " Restaurant Total Income : " + Restaurant.formatIDR(totalIncome));
	} 

}
