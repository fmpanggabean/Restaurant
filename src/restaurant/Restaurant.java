package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String resto;
	private int income;
	ArrayList<Menu>menus = new ArrayList<Menu>();
	ArrayList<Food> foods = new ArrayList<Food>();
	ArrayList<Chef> chefs = new ArrayList<Chef>();

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public Restaurant(String resto) {
		this.resto = resto;
	}
	

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public Restaurant(int income) {
		this.income = income;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		
	}
	
	public String getResto() {
		return resto;
	}

	public void setResto(String resto) {
		this.resto = resto;
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void showMenu() {
		System.out.println("Welcome to : " + this.resto + "\n");
		
		System.out.println("We provide 2 kind of menus, which are:");
		
		for (Menu menu : menus) {
			System.out.println("- "+ menu.getMenu());
			for (Food food : menu.getFoods()) {
				System.out.println("  "+food.getName() + "(" + formatIDR(food.getPrice()) + ")");
			}
		}
	}

	public void showChef() {
		System.out.println("\n"+ "Our professional chef : ");
		for (Chef chef : chefs) {
			System.out.println("- Name: "+chef.getName());
		}
		System.out.println();
	}
	
	public Food searchFood(String foodName) {
		for (Menu menu : menus) {
			for (Food food : menu.foods) {
				if(food.getName() == foodName) return food;
			}
		}
		return null;
	}
	
	public void order(Chef chef, Visitor visitor, String string, int quantity) {
		Food food = searchFood(string);
		if(food == null) {
			System.out.println("No food are comaptible\n");
			return;
		}
		
		String temp = string +" "+ "("+quantity+")";
		chef.addHistory(temp);
		visitor.addPrice(food.getPrice()*quantity);
		
		this.income += (food.getPrice()*quantity);
		
	    System.out.println(visitor.getName() + " has ordered " + quantity + " " + string + ".");
	}

	public void showTotalIncome() {
		System.out.print("Total Income : ");
		System.out.println(formatIDR(this.income));
	}

    public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.of("id", "ID")); 

        return formatter.format(amount); 
    } 
}
