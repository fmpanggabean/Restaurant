package restaurant;

import java.util.ArrayList;

import main.Food;
import people.Chef;

public class Menu {
	private String name;
	
	private ArrayList<Food> foods = new ArrayList<Food>();

	public Menu(String name) {
		super();
		this.name = name;
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

	public void add(Food food) {
		foods.add(food);
	}
	
}
