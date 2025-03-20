package restaurant;

import java.util.*;

public class Menu {
	private String type;
	List <Food> foods = new ArrayList<>();

	public Menu(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public void add(Food food) {
		foods.add(food);
	}

	public List<Food> getFoods() {
		return foods;
	}
	
	public Food getMenus(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}
}
