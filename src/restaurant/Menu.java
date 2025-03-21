package restaurant;

import java.util.ArrayList;
import java.util.HashMap;

import main.Food;

public class Menu {

	private String name;
	private ArrayList<Food> foods = new ArrayList<>();
	private HashMap<String, Integer> hashMap = new HashMap<>();

	public Menu(String name) {
		this.name = name;
	}

	public void add(Food food) {
		foods.add(food);
		getHashMap().put(food.getName(), food.getPrice());
	}

	public String getName() {
		return name;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public HashMap<String, Integer> getHashMap() {
		return hashMap;
	}
	
	

}
