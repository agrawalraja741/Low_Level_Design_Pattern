package Decorator;

public abstract class Beverages {
    int cost;
    String description;

    public Beverages(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Beverages{" +
                "cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
}
