package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private String name;
	private List<Food> foods;

	public Menu(String name) {
		this.name = name;
		this.foods = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	
	public void add(Food food)
	{
		foods.add(food);
	}
	
	
}
