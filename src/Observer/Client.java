package Observer;

import java.nio.channels.AcceptPendingException;

public class Client {
    public static void main(String[] args) {

        WeatherStation weatherStation= new WeatherStation(0); //initial setup
        weatherStation.setTemperature(41);//No one notified

        Observer observer1 = new ForcastService();
        weatherStation.addObserver(observer1);
        weatherStation.setTemperature(42);
        weatherStation.setTemperature(44);

        Observer observer2 = new AvgService();
        weatherStation.addObserver(observer2);
        weatherStation.setTemperature(43);
        weatherStation.setTemperature(41);

        weatherStation.removeObserver(observer2);
        weatherStation.setTemperature(44);

    }
}
