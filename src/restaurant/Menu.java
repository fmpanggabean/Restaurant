package restaurant;

import java.util.*;

public class Menu {

	private String type;
	private HashMap<String, Food> foods = new HashMap<>();
	
	public Menu(String type) {
		this.type = type;
	}

	public void add(Food food) {
		foods.put( food.getName(), food);
	}

	public HashMap<String, Food> getFoods() {
		return foods;
	}

	public String getType() {
		return type;
	}

}
