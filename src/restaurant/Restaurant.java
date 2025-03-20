package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private int totalIncome = 0;
	private ArrayList<Chef>chefs = new ArrayList<>();
	private ArrayList<Menu>menus =  new ArrayList<>();

	public Restaurant(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
		
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void showMenu() {
		System.out.println("Menu: ");
		
		for(Menu i: menus) {
			System.out.println("Name: " + i.getName());
		}
		
	}

	public void showChef() {
		System.out.println("Chef: ");
		
		for(Chef i: chefs) {
			System.out.println("Name: " + i.getName());
		}
		
	}

	public void order(Chef chef, Visitor visitor, String name, int quantity) {
		
		Food food = findFood(name);
		
		if(food != null) {
			double price = food.getPrice() *quantity;
			chef.addCookHistory(name, quantity);
			visitor.addOrder(price);
			
			totalIncome += price;
			
			System.out.println(chef.getName()+" cooking "+ food.getName() + " quantity: " + quantity + " for "+ visitor.getName());
		}
		else {
			System.out.println("Food not found!");
		}
		
		
	}
	
	private Food findFood(String foodName) {
        for (Menu menu : menus) {
            Food food = menu.getFood(foodName);
            if (food != null) {
                return food;
            }
        }
        return null;
    }

	public void showTotalIncome() {
		System.out.println("Total Income: Rp. " + totalIncome);
		
	}
	

}
