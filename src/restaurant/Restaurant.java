package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs = new ArrayList<Chef>(); 
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private int totalIncome  = 0;

	public Restaurant(String name) {
		this.name = name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.println("Restaurant " +name);
		System.out.println("");
		
		for(Menu i : menus) {
			System.out.println(i.getMenu());
			
			for(Food j : i.getFoods()) {
				System.out.println("  " + j.getName() +" -> " + j.getPrice());
			}
		}
		System.out.println("");
	}

	public void showChef() {
		System.out.println("Chefs:");
		for(Chef i : chefs) {
			System.out.println("  " + i.getName());
		}
		System.out.println("");
	}

	public void order(Chef chef, Visitor visitor, String foodOrder, int quantity) {
		System.out.println("Order for chef "+chef.getName()+". "+ quantity +" "+foodOrder+" by "+visitor.getName());
		
		for(Menu i : menus) {
			Food food = i.getFood(foodOrder);
			if(food != null) {
				int totalCost = food.getPrice() * quantity;
				visitor.addBill(totalCost);
				chef.cook(foodOrder +" "+quantity);
				totalIncome+=totalCost;	
			}
		}
	}

	public void showTotalIncome() {
		System.out.println("");
		System.out.println("Total Income: "+totalIncome);
	}

	

}
