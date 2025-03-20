package people;

import java.util.HashMap;

import restaurant.Food;

public class Chef {
	private String name;
	private HashMap<Food, Integer> cookedFoods = new HashMap<Food, Integer>();

	public HashMap<Food, Integer> getCookedFoods() {
		return cookedFoods;
	}

	public void setCookedFoods(HashMap<Food, Integer> cookedFoods) {
		this.cookedFoods = cookedFoods;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chef(String name) {
		this.name = name;
	}
	
	public void addCookedFoods(Food food, int amount) {
		if(this.cookedFoods.containsKey(food) == false) {
			this.cookedFoods.put(food, amount);
		} else {
			this.cookedFoods.replace(food, this.cookedFoods.get(food) + amount);
		}
	}

	public void showCookHistory() {
		System.out.println(this.name + "'s Cook History:");
		for(Food cooked : this.cookedFoods.keySet()) {
			System.out.println("  - " + cooked.getName() + ": " + this.cookedFoods.get(cooked));
		}
		System.out.println();
	}
}

