package restaurant;

import java.util.ArrayList;
import main.Food;

public class Menu {
	private String name;
	private ArrayList<Food> foods;
	
	public Menu(String name) {
		this.name = name;
		this.foods = new ArrayList<Food>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}

	public void add(Food food) {
		this.foods.add(food);
	}

}
