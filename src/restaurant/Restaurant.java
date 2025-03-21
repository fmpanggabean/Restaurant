package restaurant;

import java.util.ArrayList;
import java.util.List;

import people.Chef;
import people.Visitor;

public class Restaurant {

	private String name;
	private List<Menu> menus;
	private List<Chef> chefs;
	private int totalIncome = 0;
	
	public Restaurant(String name) {
		this.name = name;
		menus = new ArrayList<>();
		chefs = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public void addMenu(Menu course) {
		
		menus.add(course);
		
	}
	
	public void addChef(Chef chef) {
		
		chefs.add(chef);
		
	}

//	public List<Menu> getMenus() {
//		return menus;
//	}

	public void showMenu() {
		
		System.out.println("+---------------+");
		System.out.println("| Restaurant XX |");
		System.out.println("+---------------+");
		
		
		for(Menu menu : menus) {
			System.out.println();
			System.out.println("===============================================");
			System.out.println(menu.getMenus());
			System.out.println("-----------------------------------------------");
			
			System.out.println("             Name               | Price      ");
			System.out.println("-----------------------------------------------");
			
			menu.getFoods().forEach((foodName, food) -> {
				System.out.printf(" %-30s | Rp.%d \n", foodName, food.getPrice());
			});
			
		}
		System.out.println("===============================================\n");
			
	}

	public void showChef() {
		
		System.out.println("Availible Chef :");
		for (Chef chef : chefs) {
			System.out.printf("- Chef %s is ready!\n", chef.getName());
		}
		System.out.println("===============================================\n");
		
	}

	private int calculateFee(int amount, Food food) {
		
		return amount*food.getPrice();
		
	}
	
	public void order(Chef chef, Visitor visitor, String orderedFood, int amount) {
		
		Food food = null;
		
		for(Menu menu : menus) {
			
			if( menu.getFoods().containsKey(orderedFood)) {
				food = menu.getFoods().get(orderedFood);
				break;
			};
			
		}

		if (food == null) {
			System.out.println("-> There's no " + orderedFood + " here :<");
			return;
		}
		
		String order = chef.getName() + " accept an order for " + amount + " " + orderedFood + " from " + visitor.getName();				
		chef.setOrders(order);
		visitor.setTotalSpend(calculateFee(amount, food));
		totalIncome += calculateFee(amount, food);
		
		
		
	}

	public void showTotalIncome() {
		System.out.println("Total income for restaurant " + name + " is Rp." + totalIncome);
		
	}


}
