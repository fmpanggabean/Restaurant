package restaurant;

import java.util.ArrayList;

public class Menu {

	private String category;
	private ArrayList<Food> foods = new ArrayList<>();

	public Menu(String category) {
		this.category = category;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getCategory() {
		return category;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}
	
}
