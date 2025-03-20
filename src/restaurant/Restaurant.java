package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int totalIncome = 0;

	public Restaurant(String name) {
		this.name = name;
	}

	public void addMenu(Menu menu) {
		this.menus.add(menu);
	}
	
	// Helper method to format currency in IDR
	// i don't make this method in Main because i don't want to change the question
    public static String formatIDR(int amount) { 

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        return formatter.format(amount); 

    }

	public void showMenu() {
		System.out.println("+=============================================================================================+");
		System.out.println("|                                       "+this.name+"                                          |");
		System.out.println("+=============================================================================================+");
		System.out.println("   Menus available :");
		for (Menu menu : menus) {
			System.out.println("   "+menu.getCategory()+" :");
			
			for (Food food : menu.getFoods()) {
				System.out.println("      - "+food.getNameFood()+" ,price : "+ formatIDR(food.getPrice()) );
			}
		}
	}

	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	
	public void showChef() {
		System.out.println("");
		System.out.println("Show Chef In Restourant :");
		for (Chef chef : chefs) {
			System.out.println("  - "+chef.getName());
		}
		System.out.println("");
	}

	public void order(Chef chef, Visitor visitor, String nameFood, int quantity) {
		String ordered = "  - "+chef.getName()+" has visitor name is "+visitor.getName()+" with ordered "+nameFood+" with quantity "+quantity;
		chef.getHistoryChefs().add(ordered);
		
		for (Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(nameFood.equals(food.getNameFood())){
					totalIncome += (food.getPrice()*quantity);
					visitor.setTotalPrice(visitor.getTotalPrice() + (quantity * food.getPrice()));
				}
			}
		}
	}

	public void showTotalIncome() {
		System.out.println("Total Income from "+this.name+" is "+formatIDR(this.totalIncome));
	}

	
	
	
}
