package Decorator;

public class Milk implements Addons{

    Beverages beverages;
    int MilkCost = 25;

    public Milk(Beverages beverages) {
        this.beverages = beverages;
    }

    public Beverages addons() {
        int basecost = beverages.cost;
        beverages.cost += MilkCost;
        return beverages;
    }
}
