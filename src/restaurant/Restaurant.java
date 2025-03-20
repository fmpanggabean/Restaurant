package restaurant;
import java.util.*;
import java.text.*;
import people.Chef;
import people.Visitor;
public class Restaurant {
	private String name;
	private List<Menu> menus = new ArrayList<>();
	private List<Chef> chefs = new ArrayList<>();
	private int totalCostRes;
	
	public Restaurant(String name) {
		super();
		this.name = name;
		System.out.println("+========================================+");
		System.out.println("|             "+name+"               |");
		System.out.println("+========================================+\n");
	}

	public String getName() {
		return name;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		
	}

	public void showMenu() {
		System.out.println("Menu in Restaurant "+name+" :");
		for(Menu menu:menus) {
			System.out.println("  #Menu : "+menu.getName());
			for(Food food:menu.getFoods()) {
				System.out.println("    - Name: "+food.getNameFood()+", Price: "+formatIDR(food.getPrice()) );
			}
			System.out.println("");
		}
	}

	public void showChef() {
		System.out.println("Chef in Restaurant "+name+" :");
		for(Chef chef:chefs) {
			System.out.println("  - Name: "+chef.getName());
		}
		System.out.println("");
		System.out.println("Transaksi Pembeli :");
	}
	
	public void order(Chef chef, Visitor visitor, String nameJajan, int jml) {
		
		for(Menu menu:menus) {
			Food food = menu.getFood(nameJajan);
			if(food!=null) {
				int cost = food.getPrice()*jml;
				visitor.addPrice(cost);
				chef.addHistory(nameJajan, jml);
				totalCostRes+=cost;
				System.out.println("  -"+visitor.getName()+" membeli "+nameJajan+" sebanyak "+jml+ " dari chef "+chef.getName());
				return;
			}	
		}
		System.out.println("Food not found: " + nameJajan);
	}
	
	public void showTotalIncome() {
		System.out.println("\n=========================================");
		System.out.println("Total income : "+formatIDR(totalCostRes));
		System.out.println("=========================================");
	}
	
	public static String formatIDR(int amount) { 
		@SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
	    return formatter.format(amount);
	}
}


