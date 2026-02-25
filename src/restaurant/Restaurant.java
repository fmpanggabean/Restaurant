package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String restaurantName;
	private int income = 0;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	public Restaurant(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public ArrayList<Chef> getChefs() {
		return chefs;
	}
	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}
	
	public void addMenu(Menu mainCourse) {
		this.menus.add(mainCourse);
	}
	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	public void showMenu() {
		System.out.println("Menu in Restaurant:");
		for (Menu menu : menus) {
			System.out.println(menu.getTypeFood()+":");
			for (Food food : menu.getFoods()) {
				System.out.println("- "+food.getFoodName());
			}
		}
	}
	
	public void showChef() {
		System.out.println("Chef in Restaurant: ");
		int count = 1;
		
		for (Chef chefs : chefs) {
			System.out.println((count++)+". Chef "+chefs.getChefName());
		}
	}
	public Food searchFood(String foodName) {
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getFoodName() == foodName) {
					return food;
				}
			}
		}
		return null;
	}
	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		Food tempFood = searchFood(foodName);
		if(tempFood == null) {
			System.out.println("no have this menu");
			return;
		}
		chef.addOrder(tempFood,quantity);
		int total = quantity * tempFood.getPrice();
		visitor.addExpenses(total);
		this.income += total;
	}
	
	public void showTotalIncome() {
		System.out.println(this.getRestaurantName()+"'s Total Income :"+ formatIDR(this.income));
	}
	
	 public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 
    } 
}
