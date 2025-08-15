package Decorator;

public class Cream implements Addons{
    Beverages beverages;
    int creamCost = 20;

    public Cream(Beverages beverages) {
        this.beverages = beverages;
    }

    public Beverages addons() {
        int basecost = beverages.cost;
        beverages.cost += creamCost;
        return beverages;
    }
}
