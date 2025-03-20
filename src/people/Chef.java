package people; 
import java.util.*; 

public class Chef {
	private String name; 
	private ArrayList<String> cookHistory = new ArrayList<>();  
	
	public Chef(String name) {
		this.name = name; 
	}
	
	public List<String> getCookHistory(){
		return cookHistory; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void showCookHistory() {
		System.out.println(); 
		System.out.println("Cook History of Chef " + name + ":"); 
		for(String history : cookHistory) {
			System.out.println("  - " + history); 
		}
		System.out.println(); 
	}
}
