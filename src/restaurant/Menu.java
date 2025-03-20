package restaurant;

import java.util.HashMap;

import main.Main;

public class Menu {
	private String name;
	private HashMap<String, Food> foods = new HashMap<>();
	
	public Menu(String name) {
		this.name=name;
	}

	public void add(Food food) {
		foods.put(food.getName(), food);
		System.out.println(food.getName() + " is added to " + name);
	}

	public String getName() {
		return name;
	}

	public void showFood() {
		for(Food food : foods.values()) {
			System.out.println("  - " + food.getName() + " (" + Main.formatIDR(food.getPrice()) + ")");
		}
	}

	public HashMap<String, Food> getFoods() {
		return foods;
	}

}
