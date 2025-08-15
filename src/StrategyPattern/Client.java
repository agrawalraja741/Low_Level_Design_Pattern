package StrategyPattern;

public class Client {

    public static void main(String[] args) {

        Bird bird = new Bird(250,"high");
        bird.fly();
        Bird bird2 = new Bird(70,"low");
        bird2.fly();
    }
}
