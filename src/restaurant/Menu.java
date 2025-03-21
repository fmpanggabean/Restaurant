package restaurant;

import java.util.HashMap;

public class Menu {

	private String name;
	private HashMap<String, Food> foods = new HashMap<>();

	public Menu(String name) {
		this.name = name;
	}

	public void add(Food food) {
		foods.put(food.getName(), food);
		
	}

	public String getName() {
		return name;
	}
	
	public Food getFood(String foodName) {
		for(Food food : foods.values()) {
			if(food.getName().equals(foodName)) {
				return food;
			}
		}
		return null;
	}

	public void showFoods() {
		for(Food food : foods.values()) {
			System.out.println("   -" + food.getName() + " (Price: " + Restaurant.formatIDR(food.getPrice()) + ")");
		}
	}
	

}
