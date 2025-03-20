package restaurant;
import java.util.*; 

public class Menu {
	private String name; 
	private ArrayList<Food> foods = new ArrayList<>(); 
	
	public String getName() {
		return name; 
	}
	
	public List<Food> getFood(){
		return foods; 
	}
	
	
	public Menu(String name) {
		this.name = name; 
	}
	
	public void add(Food f) {
		foods.add(f); 
	}
}
