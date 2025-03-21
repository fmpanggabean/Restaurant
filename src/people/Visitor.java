package people;

public class Visitor {
    private String name;
    int totalPrice;

    public Visitor(String name) {
        this.name = name;
    }
    public void addExpense(int price){
        totalPrice += price;
    }
    public void showTotalPrice(){
        System.out.println("Visitor " +this.name + " Total price: " +this.totalPrice);
    }
    public String getName() {
        return name;
    }
   
}
