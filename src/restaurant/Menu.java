package restaurant;

import java.util.*;

public class Menu {
	private String title;
	private HashMap<String, Food> foods = new HashMap<>();
	
	public Menu(String title) {
		this.title = title;
	}
	
	public void add(Food food) {
		foods.put(food.getName(), food);
	}
	
	public String getTitle() {
		return title;
	}

	public HashMap<String, Food> getFoods() {
		return foods;
	}
}
