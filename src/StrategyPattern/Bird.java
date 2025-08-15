package StrategyPattern;

public class Bird {

    private int speed;
    private FlyingStrategy flyingStrategy;

    public Bird(int speed, String FlyingType) {
        this.speed = speed;

        //Adding simple factory pattern
        flyingStrategy = FlyingStrategyFactory.getFlyingStrategy(FlyingType);
    }

    public void fly() {
        flyingStrategy.fly();
    }
}
