package restaurant;
import java.util.*;

import main.Food;

public class Menu {
	private String name;
	private List<Food> foods = new ArrayList<>();
	public Menu(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	 public void add(Food food) {
	        foods.add(food);
	 }

	public List<Food> getFoods() {
		return foods;
	}
	 
	 
	
}
