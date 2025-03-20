package people;

import java.util.*;

import restaurant.Food;
import restaurant.Restaurant;

public class Chef {
	private String name;
	private List<String> histories = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getFoods() {
		return histories;
	}

	public void setFoods(List<String> foods) {
		this.histories = histories;
	}
	
	public void addHistory(Food food, int quantity) {
	    String text = String.format("%-25s | Quantity: %-5d", food.getName(), quantity);
	    histories.add(text);
	}


	public void showCookHistory() {
	    System.out.println("\n========================================================");
	    System.out.printf("# Cook History for Chef: %-20s\n", name);
	    System.out.println("========================================================");
	    System.out.printf("%-5s %-40s\n", "No", "History");
	    System.out.println("--------------------------------------------------------");

	    int i = 0;
	    for (String history : histories) {
	        i++;
	        System.out.printf("%-5d %-40s\n", i, history);
	    }

	    System.out.println("========================================================");
	}

}
