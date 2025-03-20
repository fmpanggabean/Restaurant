package people;

public class Visitor {
    private String name;
    private int totalPrice = 0;

    public Visitor(String name) {
        this.name = name;
    }

    public void addToTotalPrice(int price) {
        totalPrice += price;
    }

    public void showTotalPrice() {
        System.out.println(name + "'s total price: " + totalPrice);
    }
}