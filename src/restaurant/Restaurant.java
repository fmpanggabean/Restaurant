package restaurant;

import java.util.ArrayList;

import main.Helper;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private ArrayList <Chef> chefs = new ArrayList<>();
	private ArrayList <Menu> menus = new ArrayList<>();
	private String name;
	private int income;
	
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
		System.out.println(name + " Restaurant");
		System.out.println();
		
		System.out.println("Menus : ");
		for (Menu menu : menus) {
			System.out.println("- " + menu.getName());
			for (Food food : menu.getFoods()) {
				System.out.println("  - " + food.getName() + ", Price: " + Helper.formatIDR(food.getPrice()));
			}
		}
		System.out.println();
	}

	public void showChef() {
		System.out.println("Chefs : ");
		for (Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		String order = "Visitor : " + visitor.getName() + " ordered " + foodName + " with quantity : " + quantity;
		chef.addCookHistory(order);
		int price = -1;
		
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if (foodName.equals(food.getName())) {
					price = food.getPrice();
					break;
				}
			}
		}
		
		visitor.setTotalPrice(price * quantity);
		setIncome(price * quantity);
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println("Total income : " + Helper.formatIDR(income));
	}
	
	public void setIncome(int totalPrice) {
		income += totalPrice;
	}

}
