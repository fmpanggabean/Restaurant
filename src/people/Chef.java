package people;

import java.util.HashMap;

import restaurant.Food;

public class Chef {
	private String name;
	private HashMap<Food, Integer> cookedFoods = new HashMap<Food, Integer>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<Food, Integer> getCookedFoods() {
		return cookedFoods;
	}
	
	public void setCookedFoods(HashMap<Food, Integer> cookedFoods) {
		this.cookedFoods = cookedFoods;
	}
	
	public Chef(String name) {
		this.name = name;
		
	}
	
	public void addCookedFood(Food food, int qty) {
		if (this.cookedFoods.containsKey(food) == false) {
			this.cookedFoods.put(food, qty);			
		} else {
			this.cookedFoods.replace(food, this.cookedFoods.get(food) + qty);
		}
	}
	
	public void showCookHistory() {
		System.out.printf("%s's Cooking History:\n", this.name);
		for (Food food : this.cookedFoods.keySet()) {
			System.out.printf("   - %s, Amount: %d\n", food.getName(), this.cookedFoods.get(food));
		}
	}


}
