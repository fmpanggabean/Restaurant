package main;

import java.util.ArrayList;
import restaurant.Food;

public class Menu {
	private String food;
	private ArrayList<Food> foods = new ArrayList<Food>();

	public Menu(String food) {
		super();
		this.food = food;
	}

	public String getFood() {
		return food;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void add(Food food) {
		foods.add(food);
	}
	
	
}
