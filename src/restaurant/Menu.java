package restaurant;

import java.util.ArrayList;
import java.util.List;

import main.Food;

public class Menu {
	private String name;
	private List<Food> foods = new ArrayList<Food>();

	public Menu(String name) {
		this.name = name;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getName() {
		return name;
	}

	public List<Food> getFoods() {
		return foods;
	}
}
