package restaurant;

import java.util.ArrayList;

public class Menu {
	private String type;
	private ArrayList<Food> foods = new ArrayList<Food>();
	public Menu(String type) {
		super();
		this.type = type;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
	
}
