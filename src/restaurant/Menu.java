package restaurant;

import java.util.LinkedHashMap;
import java.util.Map;

import main.FormatUtils;

public class Menu {

	private String name;
	private Map<String, Food> foods = new LinkedHashMap<>();

	public Menu(String name) {
		this.name = name;
	}

	public void add(Food food) {
		foods.put(food.getName(), food);
	}
	
	public Food getFood(String name) {
		return foods.get(name);
	}

	public void show() {
		System.out.println("- " + name);
		foods.values().forEach(f -> {
			System.out.println("  - " + f.getName() + ": " + 
					FormatUtils.formatIDR(f.getPrice()));
		});
	}
}
