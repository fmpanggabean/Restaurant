package people;

public class Visitor {
    private String name;
    private int totalPrice = 0;

    public Visitor(String name) {
        this.name = name;
    }

    public void addPrice(int amount) {
        totalPrice += amount;
    }

    public void showTotalPrice() {
        System.out.println("Visitor: " + name);
        System.out.println("Total Price: Rp" + totalPrice);
    }

    public String getName() {
        return name;
    }
}
