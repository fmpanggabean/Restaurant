package restaurant;

import java.util.*;

public class Menu {
	private String type;
	private List<Food> foods;

	public Menu(String type) {
		this.type = type;
		this.foods = new ArrayList<>();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	
	
}
