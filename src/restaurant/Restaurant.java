package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;
import java.text.NumberFormat;
import java.util.Locale;

public class Restaurant {
	private String name;
	private int totalIncome = 0;
	private ArrayList<Menu> menus =  new ArrayList<>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	
	//constructor
	public Restaurant(String name) {
		this.name = name;
		System.out.printf("Restaurant: %s\n\n", this.name);
	}
	
	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(int totalIncome) {
		this.totalIncome += totalIncome;
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}		
	
	

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		for (Menu menu : menus) {
			System.out.println("-------------------------------------------");
			System.out.printf("Menu Type: %s\n", menu.getName());
//			System.out.println("---------------------------------------");
			System.out.println();
			for (Food food : menu.getFoods()) {
				System.out.printf("- Menu: %s, ", food.getName());
				System.out.printf("Price: %s\n", Restaurant.formatIDR(food.getPrice()));
			}
			System.out.println("-------------------------------------------");
			System.out.println();
		}
	}

	public void showChef() {
		System.out.printf("%s chefs:\n", this.name);
		for (Chef chef : chefs) {
			System.out.printf("- %s\n", chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
//		String history = "Name: " + foodName + ", Quantity: " +  quantity;
//		chef.addCookHistory(history);
		
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getName().equals(foodName)) {
					visitor.setTotalSpend(food.getPrice() * quantity);
					totalIncome += food.getPrice() * quantity;
					chef.setTotalIncome(food.getPrice() * quantity);
					String history = "Name: " + foodName + ", Quantity: " +  quantity + ", Income: " + formatIDR(food.getPrice() * quantity);
					chef.addCookHistory(history);
				}
			} 
		}
	}

	public void showTotalIncome() {
		System.out.printf("\n%s total income: %s\n", this.name, Restaurant.formatIDR(this.totalIncome));
	}
	
	public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 

    }

	public void addChef(Chef chef) {
		this.chefs.add(chef);
	} 
	
	
}
