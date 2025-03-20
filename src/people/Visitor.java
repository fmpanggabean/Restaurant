package people;

public class Visitor {
    private String name;
    private int totalPrice;

    public Visitor(String name) {
        this.name = name;
        this.totalPrice = 0;
    }

    public String getName() {
        return name;
    }

    public void addBill(int amount) {
        totalPrice += amount;
    }

    public void showTotalPrice() {
        System.out.println("\nTotal harga pesanan " + name + ": Rp " + totalPrice);
    }
}
