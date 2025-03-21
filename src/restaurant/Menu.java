package restaurant;

import java.util.ArrayList;

public class Menu {
	private String name;
	private ArrayList<Food> foods = new ArrayList<Food>();

	public Menu(String name) {
		this.name = name;
	}
	
	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(Food food) {
		this.foods.add(food);
	}
	
	
	
}
