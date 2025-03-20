package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;
import main.Main;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<>();
	private ArrayList<Chef> chefs = new ArrayList<>();
	private int income = 0;

	public Restaurant(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}
	
	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void showMenu() {
		System.out.println("Menu : ");
		for (Menu menu : menus) {
			System.out.println(menu.getName());
			int count = 1;
			for(Food food : menu.getFoods()) {
				System.out.println(count + ". " + food.getName() + " (Price : " + Main.formatIDR(food.getPrice()) + ")" );
				count++;
			}
		}
		System.out.println();
	}

	public void showChef() {
		System.out.println("Chef: ");
		for(Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef1, Visitor visitor1, String menuName, int quantity) {
		for(Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName().equals(menuName)) {
					visitor1.setTotalPrice(visitor1.getTotalPrice() + (food.getPrice() * quantity));
					income += (food.getPrice() * quantity);
					break;
				}
			}
		}
		String history = "- " + menuName + " (Quantity: " + quantity + ")";
		chef1.addHistory(history);
	}

	public void showTotalIncome() {
		System.out.println("Restaurant Income: " + Main.formatIDR(this.income) );
		
	}
}
