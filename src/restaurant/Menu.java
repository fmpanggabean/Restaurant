package restaurant;
import java.util.ArrayList;

public class Menu {
	private String typeMenu;
	private ArrayList<Food> listOfFood = new ArrayList<Food>();
	
	public Menu(String typeMenu) {
		this.typeMenu = typeMenu;
	}
	
	public void add(Food food) {
		listOfFood.add(food);
	}
	
	public ArrayList<Food> getListFood(){
		return listOfFood;
	}
	
	public String getTypeMenu() {
		return typeMenu;
	}
	
}
