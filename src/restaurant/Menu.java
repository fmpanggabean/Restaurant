package restaurant;

import java.util.ArrayList;

import main.Food;

public class Menu {
	private String category;
	private ArrayList<Food> foods = new ArrayList<Food>();

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Menu(String category) {
		super();
		this.category = category;
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
