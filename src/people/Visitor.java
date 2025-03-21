package people;

public class Visitor {
	public String nameVisit;
	public int totalPrice = 0;

	public Visitor(String nameVisit) {
		super();
		this.nameVisit = nameVisit;
	}
	
	

	public Visitor(int totalPrice) {
		super();
		this.totalPrice = totalPrice;
	}

	public void spent(int price) {
		totalPrice += price; 
	}

	public void showTotalPrice() {
		// TODO Auto-generated method stub
		
		System.out.println("Total Price " + nameVisit +" = " + totalPrice);
	}
	
	
}
