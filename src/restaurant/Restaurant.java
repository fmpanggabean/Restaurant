package restaurant;

import java.util.ArrayList;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int income = 0; 

	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void order(Chef chef, Visitor visitor, String menuChoice, int amount) {
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if (menuChoice.equals(food.getName())) {
					String order = "Customer: "+ visitor.getName() + " - " + "Ordered: " + menuChoice + "(" + amount + ")";
					chef.setOrderHistories(order);
					visitor.setTotalPrice((amount*food.getPrice()) + visitor.getTotalPrice());
					income += (amount*food.getPrice());
				}
			}
		}
	}

	public void showMenu() {
		System.out.println("==================== " + this.name +"'s Menu ====================");
		for (Menu menu : menus) {
			System.out.println(menu.getMenu());
			for (Food food : menu.getFoods()) {
				System.out.println("   o " + food.getName() + " - Price: " + food.getPrice());
			}
		}
	}

	public void showChef() {
		System.out.println("==================== " + this.name +"'s Chef ====================");
		for (Chef chef : chefs) {
			System.out.println("   o Chef " + chef.getName());
		}
		System.out.println("=============================================================");
	}

	public void showTotalIncome() {
		System.out.println("Total Restaurant Income: " + income);
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
}
