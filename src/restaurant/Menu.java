package restaurant;
import java.util.*;
public class Menu {
	private String name;
	private List<Food> foods = new ArrayList<>();
	
	public Menu(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Food> getFoods() {
		return foods;
	}
	
	public void add(Food food) {
		foods.add(food);
	}
	
	public Food getFood(String name) {
		for(Food food:foods) {
			if(food.getNameFood().equals(name)) {
				return food;
			}
		}
		return null;
	}
	
}
