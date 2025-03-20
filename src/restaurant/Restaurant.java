package restaurant;

import java.util.ArrayList;
import java.text.NumberFormat; 
import java.util.Locale; 

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private Integer totalIncome = 0;

	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.println(this.name + " Restaurant Menu's:");
		int i = 1;
		for (Menu menu : menus) {
			System.out.println( i++ + ". " +menu.getName());
			
			for (Food food : menu.getFoods()) {
				System.out.println(String.format("    %s-%s", food.getName(), formatIDR(food.getPrice())));
			}			
			
		}
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public void showChef() {
		System.out.println(this.name + " Restaurant Chef's:");
		int i = 1;
		for (Chef chef : chefs) {
			System.out.println( i++ +". " + chef.getName());
		}
	}

	public void order(Chef chef, Visitor visitor, String foodName, Integer quantity) {
		// search
		Food searched = null;
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getName().equals(foodName)) {
					searched = food;
					break;
				}
			}			
			
			if(searched != null) break;
		}
		
		if(searched == null) {
			System.out.println("Food not found!");
			return;
		}
		
		visitor.addPrice(searched.getPrice()*quantity);
		chef.addHistory(String.format("%s cook %d %s for %s", chef.getName(), quantity, foodName, visitor.getName()));
		this.totalIncome += searched.getPrice()*quantity;
	}

	public void showTotalIncome() {
		System.out.println(this.name + "total income : " + formatIDR(this.totalIncome));
		
	}
	
	public static String formatIDR(int amount) { 

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        return formatter.format(amount); 

    } 
	
	
}
