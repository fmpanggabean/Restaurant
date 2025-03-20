package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private String name;
	List<Food> foods = new ArrayList<Food>();
	
	public Menu(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void add(Food f) {
		foods.add(f);
	}
	
	public List<Food> getFoods(){
		return foods;
	}
}
