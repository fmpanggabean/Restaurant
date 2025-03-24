package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private String name;
	private List<Food> foods = new ArrayList<Food>();

	public Menu(String name) {
		this.name = name;
	}
	
	public void add(Food f) {
		foods.add(f);
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
