package restaurant;
import java.util.*;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name; 
	private List<Menu> menus = new ArrayList<>(); 
	private List<Chef> chefs = new ArrayList<>(); 
	private double totalIncome; 
	
	public Restaurant(String name) {
		this.name = name; 
		this.totalIncome = 0; 
	}

	public void addMenu(Menu menu) {
		menus.add(menu); 
		
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef); 
	}

	public void showChef() {
		System.out.println("\n=== Daftar Chef ===");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
		
	}

	public void showMenu() {
		System.out.println("\n=== Menu di " + name + " ===");
        for (Menu menu : menus) {
            menu.showMenu();
        }
		
	}

	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
	    Food food = findFood(foodName);
	    if (food == null) {
	        System.out.println("Makanan \"" + foodName + "\" tidak ditemukan di menu!");
	        return;
	    }

	    double totalPrice = food.getPrice() * quantity;
	    visitor.addOrder(food, totalPrice); 
	    chef.cook(food, quantity);
	    totalIncome += totalPrice; 

	    System.out.println(visitor.getName() + " memesan " + quantity + "x " + food.getName() +
	            " kepada Chef " + chef.getName() + ". Total: Rp " + totalPrice);
	}
	
	private Food findFood(String foodName) {
        for (Menu menu : menus) {
            for (Food food : menu.getFoods()) {
                if (food.getName().equalsIgnoreCase(foodName)) {
                    return food;
                }
            }
        }
        return null;
    }

    public void showTotalIncome() {
        System.out.println("\nTotal Pendapatan Restoran: Rp " + totalIncome);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(List<Chef> chefs) {
		this.chefs = chefs;
	}

	public double getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}
	
	

}
