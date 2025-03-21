package people;

public class Visitor {
    private String name;
    private int totalCost;

    public Visitor(String name) {
        this.name = name;
        this.totalCost = 0;
    }

    public String getName() {
        return name;
    }

    public void addTotalCost(int cost) {
        this.totalCost += cost;
    }

    public void showTotalPrice() {
        System.out.println(name + " menghabiskan total Rp" + totalCost);
    }
}
