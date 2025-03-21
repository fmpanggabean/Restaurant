package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private int totalIncome = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu category) {
		menus.add(category);
	}

	public void showMenu() {
		System.out.println("===== MENUS =====");
		menus.forEach((m) -> {
			System.out.println("> " + m.getCategory());
			
			m.getFoods().forEach((f) -> {
				System.out.println(" - " + f.getName() + " : " + f.getPrice());
			});
//			System.out.println();
		});
		System.out.println();
	}

	public void showChef() {
		System.out.println("===== CHEFS =====");
		chefs.forEach((c) -> {
			System.out.println("- Chef " + c.getName());
		});
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String foodName, int ammount) {
		String massage = "> Chef "+chef.getName()+" is preparing "+foodName+" for "+visitor.getName()+" || Total Ammount: "+ammount;
		
		int totalPrice = 0;
		int found = 1;
		for (int i = 0; i < menus.size(); i++) {
			for (int j = 0; j < menus.get(i).getFoods().size(); j++) {
				if (menus.get(i).getFoods().get(j).getName() == foodName) {
					totalPrice = menus.get(i).getFoods().get(j).getPrice() * ammount;
					found = 0;
					break;
				}
			}
			if (found == 0) {
				break;
			}
		}
		
		totalIncome += totalPrice;
		visitor.setTotalPrice(totalPrice);
		chef.addHistoryOfOrder(massage);
	}

	public void showTotalIncome() {
		System.out.println("\n>> TOTAL INCOME : " + totalIncome);
	}

}
