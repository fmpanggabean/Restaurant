package restaurant;

import java.util.ArrayList;

public class Menu {
	
	private String name;
	ArrayList<Food> foods = new ArrayList<Food>();
	
	public Menu(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void add(Food food) {
		foods.add(food);
	}
	
	public ArrayList<Food> getFoods() {
		return foods;
	}

}
