package restaurant;

import java.util.*;

public class Menu {
	private String name;
	private ArrayList<Food> foods = new ArrayList<Food>();
	
	public Menu(String name) {
		this.setName(name);
	}
	public void add(Food food) {
		foods.add(food);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Food> getFoods() {
		return foods;
	}
	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}

	
}
