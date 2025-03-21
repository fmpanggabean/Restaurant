package restaurant;

import java.util.ArrayList;
import people.Chef;
import people.Visitor;

public class Restaurant {

	private String name;
	private ArrayList <Chef> chefs = new ArrayList<>();
	private ArrayList <Menu> menus = new ArrayList<>();
	private int totalIncome;
	
	public Restaurant(String name) {
		this.name = name;
		this.totalIncome = 0;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
		
	}

	public void addMenu(Menu mainCourse) {
		menus.add(mainCourse);
		
	}

	public void showMenu() {
		
		System.out.println("Restaurant " +name+ " Menu\n");
		
		for(Menu menu : menus) {
			System.out.println(menu.getMainCourse() +": ");
			
			for(Food food : menu.getFoods()) {
				System.out.println("  "+food.getName() +" : Rp"+ food.getPrice());
			}
			System.out.println("");
		}
		System.out.println("");
		
	}
	

	public void showChef() {
		System.out.println("Chefs at " + name + ": ");
		for(Chef chef : chefs) {
			System.out.println(" - " + chef.getName());
		}
		System.out.println("");
		
	}

	public void order(Chef chef, Visitor visitor, String nameFood, int quantity) {
		for(Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName().equals(nameFood)) {
					int totalPrice = food.getPrice() * quantity;
					visitor.addTotalPrice(totalPrice);
					chef.cook(nameFood, quantity);
					totalIncome += totalPrice;
					return;
				}
				
			}
		}
		System.out.println("Food " + nameFood + " not found on the menu.");		
	}
	
	public void showTotalIncome() {
		System.out.println("Total Income : Rp" + totalIncome);
	}

}
