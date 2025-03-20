package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	
	private Integer totalIncome = 0;
	
	
	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMenu(Menu m) {
		menus.add(m);
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void showChef() {
		System.out.println("\nChef:");
		
		chefs.forEach((c)->{
			System.out.println("- " + c.getName());
		});
	}

	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menus:");
		menus.forEach((m)->{
			System.out.println("- " + m.getName());
			
			m.getFoods().forEach((f)->{
				System.out.println("  - " + f.getName() + ", Price: " + f.getPrice());
			});
		});
	}

	public void order(Chef chef1, Visitor visitor1, String menuName, int ammount) {
		String message = "Chef "+ chef1.getName() +" is preparing "+menuName+" for "+visitor1.getName()+". Total amount: "+ammount+"";
		System.out.println(message);
		
		int totalPrice = 0; //harus kita cari lewat menu, terus cari lewat makanan, terus ambil harganya. Setelah itu kita kalikan dengan ammount
		
		int sentinel = 1;
		for(int i = 0; i < menus.size(); i++) {
			for(int j = 0; j < menus.get(i).getFoods().size(); j++) {
				if(menus.get(i).getFoods().get(j).getName() == menuName) {
//					menus[i].foods[j].name == menuName
					sentinel = 0;
					totalPrice = menus.get(i).getFoods().get(j).getPrice() * ammount;
					break;
				}
			}
			
			if(sentinel == 0) {
				break;
			}
		}
		
		visitor1.setTotalPrice(totalPrice);
		chef1.addHistory(message);
		
		totalIncome += totalPrice;
	}

	public void showTotalIncome() {
		System.out.println("\nTotal Income: " + totalIncome);
	}


	
	
}
