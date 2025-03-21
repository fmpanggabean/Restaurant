package restaurant;

import java.util.*;

import format.Formatting;
import people.Chef;
import people.Visitor;

public class Restaurant {

	private String name;
	private int income;
	private List<Chef> chefs = new ArrayList<>();
	private List<Menu> menus = new ArrayList<>();
	
	public Restaurant(String name) {
		this.name = name;
		System.out.println("--"+name+"--");
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.println("");
		System.out.println( name + "'s Menu:");
		
		for( Menu menu : menus ) {
			System.out.println("=================================");
			System.out.println("Menu Type : " + menu.getType());
			System.out.println("Food List :");
			for( String list : menu.getFoods().keySet()) {
				menu.getFoods().get(list).display();;
			}
		}
	}

	public void showChef() {
		System.out.println("\n"+ name +"'s Chef List:");
		System.out.println("=================================");
		
		for( Chef chef : chefs ) {
			System.out.println("Name : "+ chef.getName());
		}
		System.out.println("");
	}

	public void order(Chef chef, Visitor visitor, String food, int quan) {
		Food newFood = null;
		
		for( Menu menu : menus ) {
			newFood = menu.getFoods().get(food);
			
			if( newFood == null ) {
				continue;
			} else {
				visitor.setTotal(newFood.getPrice()*quan);
				visitor.setTransactions( "Food : " + food + ", Quantity : "+ quan + ", Price : "+ newFood.getPrice() );
				chef.addCooks( food + ", Quantity : "+quan);
				
				income += newFood.getPrice()*quan;
				return;
			}
		}
		
		if( newFood == null ) System.out.println("There is no "+ food +" here!");
	}

	public void showTotalIncome() {
		System.out.println("\nRestaurant Income : "+ Formatting.formatIDR(income));
	}
	
}
