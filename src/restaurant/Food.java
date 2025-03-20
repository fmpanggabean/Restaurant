package restaurant;

public class Food {
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }
}