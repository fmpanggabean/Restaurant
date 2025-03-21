package people;

import java.util.ArrayList;
import java.util.HashMap;
import restaurant.Food;

public class Chef {
	private String chefName;
	private ArrayList<Food> foods = new ArrayList<Food>();
	private HashMap<String, Integer> cookHistory = new HashMap<>();

	public Chef(String chefName) {
		super();
		this.chefName = chefName;
	}

	public String getChefName() {
		return chefName;
	}

	public void setChefName(String chefName) {
		this.chefName = chefName;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
	
	public void addFood(Food food) {
		this.foods.add(food);
	}
	
	public void cook(String foodName, int portion) {
        cookHistory.put(foodName, cookHistory.getOrDefault(foodName, 0) + portion);
    }

	public void showCookHistory() {
		System.out.println("\nChef: " + this.chefName);
		System.out.println("Cook History: ");
		for (Food food : foods) {
			System.out.println("  - " + food.getName());
		}
	}
}
