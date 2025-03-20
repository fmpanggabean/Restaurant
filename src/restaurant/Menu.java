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
	
	public HashMap<String,Food> getFoods(){
		return foods;
	}
}
