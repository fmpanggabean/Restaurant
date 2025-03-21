package restaurant;

import java.util.ArrayList;

public class Menu {
	private String type;
	private ArrayList<Food> foods = new ArrayList<>();
	
	public Menu(String type) {
		this.type = type;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getType() {
		return type;
	}

	public ArrayList<Food> getFood() {
		return foods;
	}

}
