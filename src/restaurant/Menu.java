package restaurant;
import java.util.*;

public class Menu {
	private String menuName;
	private List <Food> menu = new ArrayList<>();

	public Menu(String menuName) {
		this.menuName = menuName;
	}

	public void add(Food food) {
		menu.add(food);
		
	}

	public String getMenuName() {
		return menuName;
	}

	public List<Food> getMenu() {
		return menu;
	}
	
	 public Food getFood(String name) {
	        for (Food food : menu) {
	            if (food.getFoodName().equalsIgnoreCase(name)) {
	                return food;
	            }
	        }
	        return null;
	    }

	
}
