package StrategyPattern;

public class FlyingStrategyFactory {

    public static FlyingStrategy getFlyingStrategy(String FlyingType) {

        if(FlyingType.equalsIgnoreCase("low"))
        {
            return new LowFlyStrategy();
        }
        else if(FlyingType.equalsIgnoreCase("high"))
        {
            return new HighFlyStrategy();
        }
        else
        {
            throw new RuntimeException("Invalid FlyingType");
        }
    }
}
