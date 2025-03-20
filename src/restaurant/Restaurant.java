package restaurant;

import java.util.ArrayList;
import java.util.List;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private List<Menu>menus;
	private List<Chef>chefs;
	private int income = 0;
	
	public Restaurant(String name){
		this.name = name;
		this.menus = new ArrayList<Menu>();
		this.chefs = new ArrayList<Chef>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMenu(Menu mainCourse) {
		menus.add(mainCourse);
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu:");
		for (Menu menu : menus) {
			System.out.println("- "+menu.getName());
			for (Food food : menu.getFoods()) {
				System.out.println("  " + food.getName() + " - " + food.getPrice());
			}
		}
		
	}

	public void showChef() {
		System.out.println("Chef:");
		for (Chef chef : chefs) {
			System.out.println(" -"+chef.getName());
		}
	}

	public List<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(List<Chef> chefs) {
		this.chefs = chefs;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void order(Chef chef, Visitor visitor, String nameFood, int totalbuy) {
		boolean found = false;
		int price = 0;
		for (Menu menu : getMenus()) {
			for (Food food : menu.getFoods()) {
				if(food.getName().equals(nameFood)) {
					price += food.getPrice() * totalbuy;
					found = true;
				}
			}
		}
		
		if(found == true) {
			visitor.addSpent(price);
			
			String transaction;
			transaction = "- " +chef.getName() + " Cooked " + nameFood + " with "+ totalbuy + " pcs " + ",totalPrice = Rp " + price;
			chef.addHistory(transaction);
			
			this.income += price;
		}
		
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println("Total Income " + this.name + " = Rp " + this.income);
	}
	
}
