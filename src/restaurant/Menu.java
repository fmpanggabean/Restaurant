package restaurant;
import java.util.*;

public class Menu {
	private String name;
	private List<Food> foodList = new ArrayList<>();
	
	public void add(Food food) {
		foodList.add(food);
	}
	
	public Menu(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Food> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
}
