package restaurant;

import people.Chef;
import people.Visitor;

public class order {
    private Chef chef;
    private Visitor visitor;
    private String food;
    private int quantity;

    public order(Chef chef, Visitor visitor, String food, int quantity) {
        this.chef = chef;
        this.visitor = visitor;
        this.food = food;
        this.quantity = quantity;
    }

    public String getChef() {
        return chef.getName();
    }

    public String getVisitor() {
        return visitor.getName();
    }

    public String getFood() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return visitor.getName() + " ordered " + quantity + " x " + food + " cooked by " + chef.getName();
    }
}
