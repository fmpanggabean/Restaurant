package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private int totalIncome=0;
	
	private ArrayList<Chef>chefs=new ArrayList<>();
	private ArrayList<Menu>menus=new ArrayList<>();

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
		System.out.println("Menu at "+name +":");
		for (Menu menu : menus) {
			menu.show();
		}
	}

	public void showChef() {
		System.out.println("Chefs at "+name +":");
		for (Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		for(Menu menu: menus) {
			Food food=menu.getFood(foodName);
			if(food!=null) {
				int totalPrice=food.getPrice()*qty;
				visitor.addOrder(totalPrice);
				chef.addCookHistory(foodName,qty);
				totalIncome+=totalPrice;
				System.out.println(visitor.getName()+" ordered "+qty+"x "+ foodName);
				return;
			}
		}
		
	}

	public void showTotalIncome() {
		System.out.println("Total restaurant income: Rp "+totalIncome);
		
	}
	
	
}
