package restaurant;

import java.util.ArrayList;

public class Menu {

	private String mainCourse;
	private ArrayList<Food> foods = new ArrayList<>();
	
	public Menu(String mainCourse) {
		this.mainCourse = mainCourse;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}
	
	
	
	

}
