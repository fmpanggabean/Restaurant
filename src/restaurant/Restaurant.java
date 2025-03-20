package restaurant;

import java.util.ArrayList;

import main.Format;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name; 
	private ArrayList<Chef> chefs;
	private ArrayList<Menu> menus; 
	private ArrayList<Visitor> visitors; 
	private int qty; 
	private int totalIncome; 
	
	public Restaurant(String name) {
		this.name = name; 
		this.chefs = new ArrayList<>(); 
		this.menus = new ArrayList<>(); 
		this.visitors = new ArrayList<>();
		this.totalIncome = 0; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef); 
		
	}
	public void addMenu(Menu menu) {
		menus.add(menu); 
		
	}
	public void showMenu() {
		System.out.println(name + "'s Menu:");
		for(Menu menu : menus) {
			System.out.println("   "  + menu.getType());
			for(String food : menu.getFoods().keySet()) {
				System.out.println("      - " + food);
			}
		}
		System.out.println();
	}
	
	public void showChef() {
		System.out.println("Chefs:");
		for(Chef chef : chefs) {
			System.out.println("   - " + chef.getName());
		}
		System.out.println();
		
	}
	
	public void order(Chef chef, Visitor visitor, String name, int qty) {
		chef.addCookFood(name);
		int price = visitor.addOrder(name, qty, menus);
		visitors.add(visitor);
		visitor.setTotalSpent(qty * price); 
		totalIncome += qty * price; 
		
	}
	public void showTotalIncome() {
		System.out.println("Total Income: " + Format.formatIDR(totalIncome));
	}
	
	
	

}
