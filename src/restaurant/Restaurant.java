package restaurant;

import java.util.ArrayList;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int totalIncome = 0;
	
	public Restaurant(String name) {
		this.name = name;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		return;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
		return;
	}
	
	
	public void showMenu() {
		System.out.println("== " + this.name + "'s menus ==");
				
		for(Menu data : menus) {
			System.out.println("");
			System.out.println("- " + data.getType());	
			
			int i = 1;
			for(Food list : data.getFoods()) {
				System.out.println("  " + i + ". " + list.getName() + "( " + list.getPrice() + ")");
				i++;
			}
		}
		
		System.out.println("");
	}
	
	public void showChef() {
		
		System.out.println("Today's Chef : ");
		
		int i = 1;
		for(Chef data : chefs) {
			System.out.println(i + ". " + data.getName());
			i++;
		}
		
		System.out.println("");
	}
	
	private Food findFood(String food) {
		
		Food isFound = null;
		
		for(Menu data : menus) {
			for(Food list : data.getFoods()) {
				if(list.getName().equals(food)) {
					isFound = list;
					break;
				}
			}
			if(isFound != null) break;
		}
		
		return isFound;
	}
	
	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		
		chef.setHistory(visitor.name + " order " + foodName + " in quantity of " + quantity + ".");
		
		Food food = findFood(foodName);
		
		if(food == null) {
			System.out.println(foodName + " is not on the menu!");
			return;
		}
		
		visitor.setTotalPrice(food, quantity);
		
		this.totalIncome += visitor.getTotalPrice();
		
	}
	
	public void showTotalIncome() {
		System.out.println("");
		System.out.println(this.name + " total income : " + this.totalIncome);
		System.out.println("");
	}
}
