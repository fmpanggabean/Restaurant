package restaurant;
import java.util.ArrayList;
import java.text.NumberFormat; 
import java.util.Locale; 
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int income = 0;

	public Restaurant(String name) {
		super();
		this.name = name;
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
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
    public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 
    }  

	public void showMenu() {
		System.out.println("--- " + this.name + " ---");
		for (Menu menu : menus) {
			System.out.println("- " + menu.getFood());
			for (Food food : menu.getFoods()) {
				System.out.println(" Name : " + food.getName() + ", Price: " + formatIDR(food.getPrice()));
			}
		}
	}
	

	public void showChef() {
		System.out.println("Our Chefs : ");
		for (Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
	}

	public void order(Chef chef, Visitor visitor, String menuName, int quantity) {
		String history = menuName + ", Quantity: " + quantity;
		
		int valid = 0;
		
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getName().equals(menuName)) {
					valid = 1;
					int amount = visitor.getAmount();
					int total = quantity * food.getPrice();
					visitor.setAmount(amount + total);
					income += total;
					break;
				}
			} if(valid == 1) break;
		}
		
		if(valid == 1) {
			chef.addHistory(history);
		} else {
			System.out.println("Empty Menu!");
		}
		
	}

	public void showTotalIncome() {
		System.out.println("Total Income : " + formatIDR(income));
		
	}
	
}
