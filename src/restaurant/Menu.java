package restaurant;

import java.util.*;

import main.Food;

public class Menu {
	private String menu;
	private List<Food> foods = new ArrayList<>();
	
	public Menu(String menu) {
		this.menu = menu;
	}
	
	public String getMenu() {
		return menu;
	}
	
	public List<Food> getFoods(){
		return foods;
	}
	
	public void add(Food food) {
		foods.add(food);
	}
	
	public Food getFood(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}
}