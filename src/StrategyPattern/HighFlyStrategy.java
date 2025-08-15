package StrategyPattern;

public class HighFlyStrategy implements FlyingStrategy{

    @Override
    public void fly() {
        System.out.println("High Fly");
    }
}
