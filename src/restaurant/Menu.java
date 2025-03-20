package restaurant;

import java.util.*;

public class Menu {
	private String menu;
	List<Food> foods = new ArrayList<>();

	public Menu(String menu) {
		this.menu = menu;
	}

	public String getMenu() {
		return menu;
	}
	
	public void add(Food food) {
		foods.add(food);
	}
	
	public Food getMenus(String name) {
		for(Food food : foods) {
			if(food.getMenu().equals(name)) {
				return food;
			}
		}
		
		return null;
	}
}
