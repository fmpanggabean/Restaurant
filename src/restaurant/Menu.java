package restaurant;
import java.util.*;
public class Menu {
	private String name;
	private List<Food> foodList = new ArrayList<>();
	public Menu(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}

	public void add(Food food) {
		// TODO Auto-generated method stub
		foodList.add(food);
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

	public void showMenu() {
        System.out.println(name + " Menu:");
        for (Food food : foodList) {
            System.out.println("- " + food.getName() + " : " + food.getPrice());
        }
    }
	
	public Food getFood(String name) {
        for (Food food : foodList) {
            if (food.getName().equalsIgnoreCase(name)) {
                return food;
            }
        }
        return null;
    }


}
