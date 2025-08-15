package StrategyPattern;

public class LowFlyStrategy implements FlyingStrategy{

    @Override
    public void fly() {
        System.out.println("Low Fly");
    }
}
