package restaurant;

import java.util.ArrayList;
import java.util.List;

import main.Food;

public class Menu {
	private String name;
	private List<Food>foods;
	
	public Menu(String name) {
		this.name = name;
		this.foods = new ArrayList<Food>();
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

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	
}
