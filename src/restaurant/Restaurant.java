package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
	public String nameResto;
	public String nameFood;
	public int quantity;
	public int income = 0;
	public ArrayList<Menu> menus = new ArrayList<Menu>();
	public ArrayList<Chef> chefs = new ArrayList<Chef>();
	
	public Restaurant(String nameResto) {
		super();
		this.nameResto = nameResto;
	}

	public void addMenu(Menu mainCourse) {
		// TODO Auto-generated method stub
		menus.add(mainCourse);
	}

	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu:");
		for (Menu menu : menus) {
			System.out.println("- " + menu.cateFood);
			for (Food food : menu.foods) {
				System.out.println("  " + food.nameFood + " - " + food.priceFood);
			}
		}
	}

	public void showChef() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Chef:");
		for (Chef chef : chefs) {
			System.out.println(" - "+ chef.nameChef);
		}
	}

	public void order(Chef chef, Visitor visitor, String nameFood, int quantity) {
		// TODO Auto-generated method stub
		boolean found = false;
		int price = 0;
		for (Menu menu : menus) {
			for (Food food : menu.foods) {
				if(food.nameFood.equals(nameFood)) {
					price += food.priceFood * quantity;
					found = true;
				}
			}
		}
		
		if(found == true) {
			visitor.spent(price);
			
			String transaction;
			transaction = "- " + chef.nameChef + " make " + nameFood + " with order "+ quantity + " pcs, " + "total = Rp " + price;
			chef.addHistory(transaction);
			
			this.income += price;
		}
		
	}

	public void showTotalIncome() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Total Income: " + nameResto + " = Rp. " + income);
	}
	
	
}
