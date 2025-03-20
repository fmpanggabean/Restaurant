package restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
	private String type; 
	private HashMap<String, Food> foods; 
	
	public Menu(String type) {
		this.type = type; 
		this.foods = new HashMap<>(); 
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void add(Food food) {
		foods.put(food.getName(), food); 
		
	}
	
	public HashMap<String, Food> getFoods() {
		return foods; 
	}
	
	

}
