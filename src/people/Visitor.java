package people;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Visitor {
	private String name;
	private ArrayList<Visitor> visitor = new ArrayList<Visitor>();
	private ArrayList<String> ordered = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();
	private int totalPrice = 0;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 
    } 
	
	public void orderFood(String name, int quantity, int price) {
		this.ordered.add(name);
		this.quantities.add(quantity);
		
		totalPrice += price*quantity;
	}
	
	public void showTotalPrice() {
		System.out.println(this.name + "'s total bill: " + formatIDR(totalPrice));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Visitor> getVisitor() {
		return visitor;
	}

	public void setVisitor(ArrayList<Visitor> visitor) {
		this.visitor = visitor;
	}
}
