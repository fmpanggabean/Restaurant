package people;

import java.util.ArrayList;
import java.util.HashMap;

import restaurant.Food;

public class Chef {
	private String name;
	private ArrayList<Food> cookHistory;
	private HashMap<Food, Integer> numberCooked = new HashMap<Food, Integer>();
	
	public Chef(String name) {
		this.name = name;
		this.cookHistory = new ArrayList<>();
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println("-- " + "Chef " + this.name + "'s COOK HISTORY --");
		for (Food food : numberCooked.keySet()) {
			if (numberCooked.get(food) != null) {
				System.out.println("  - " + food.getName() + " (cooked " + numberCooked.get(food) + " times)");
			} 
		}
	}

	public HashMap<Food, Integer> getNumberCooked() {
		return numberCooked;
	}

	public void setNumberCooked(Food food, Integer num) {
		numberCooked.put(food, num);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addCookHistory(Food food) {
		this.cookHistory.add(food);
	}
}
