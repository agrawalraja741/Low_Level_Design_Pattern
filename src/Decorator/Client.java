package Decorator;

import java.beans.BeanDescriptor;

public class Client {

    public static void main(String[] args) {
        Beverages beverages = new Coffee(100,"COFFEE");
        System.out.println(beverages.getCost());
        //Extra Milk
        Addons milk = new Milk(beverages);
        beverages = milk.addons();
        System.out.println(beverages.getCost());
        //Extra Milk again
        Addons milk1 = new Milk(beverages);
        beverages = milk1.addons();
        System.out.println(beverages.getCost());
        //Extra Cream
        Addons cream = new Cream(beverages);
        beverages = cream.addons();
        System.out.println(beverages.getCost());
    }


}
