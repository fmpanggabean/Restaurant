package restaurant;

import java.util.ArrayList;

import main.Food;

public class Menu {
	private String menu;
	private ArrayList<Food> foods = new ArrayList<Food>();

	public Menu(String menu) {
		super();
		this.menu = menu;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public ArrayList<Food> getMenus() {
		return foods;
	}

	public void setMenus(ArrayList<Food> menus) {
		this.foods = menus;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
}
