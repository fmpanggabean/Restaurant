package restaurant;

import java.util.ArrayList;

public class Menu {
	private String category;
	private ArrayList<Food> foods = new ArrayList<Food>();

	public Menu(String category) {
		this.category = category;
	}

	public void add(Food food) {
		this.foods.add(food);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
	
	
}
