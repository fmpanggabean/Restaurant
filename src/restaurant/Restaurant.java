package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	Integer totalIncome = 0;

	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);	
	}

	public void showMenu() {
		System.out.println(this.name + " Menu's:");
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				System.out.println(  food.getName() + " " + formatIDR(food.getPrice()));
			}
		}
		
	}

	public void showChef() {
		System.out.println("\nChef:");
		for (Chef chef : chefs) {
			System.out.println(  chef.getName());
		}
		
	}

	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		Food temp = null;
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getName().equals(foodName)) {
					temp = food;
					break;
				}
			}
			if(temp != null) {
				break;			
			}
		}
		if(temp == null) {
			System.out.println("Food not found");
			return;
		}
		visitor.addTotalPrice(temp.getPrice()*quantity);
		chef.addHistory(String.format("%s cook %s for %s with quantity order %d", chef.getName(), foodName, visitor.getName(), quantity));
		totalIncome += temp.getPrice()*quantity;
	}

	public void showTotalIncome() {
		System.out.println("\n" + this.name + " Total Income: " + formatIDR(this.totalIncome));
	}

	public void addChef(Chef chef) {
		chefs.add(chef);	
	}

	public static String formatIDR(int amount) { 

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        return formatter.format(amount); 

    }
}
