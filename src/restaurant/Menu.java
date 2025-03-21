package restaurant;

import java.util.HashMap;

public class Menu {

	private String menu;
	//private List<Food> foods;
	private HashMap<String, Food> foods = new HashMap<>();
	
	public Menu(String menu) {
		this.menu = menu;
	}

	public String getMenus() {
		return menu;
	}

	public void add(Food food) {
		
		getFoods().put(food.getName(), food);
		
	}
	
	

	public HashMap<String, Food> getFoods() {
		return foods;
	}
	


}
