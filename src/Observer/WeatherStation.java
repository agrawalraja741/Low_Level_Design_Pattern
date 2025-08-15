package Observer;

import java.util.ArrayList;

public class WeatherStation implements Publisher {

    int temperature;
    ArrayList<Observer> observers;

    public WeatherStation(int temperature) {
        this.temperature = temperature;
        this.observers = new ArrayList<Observer>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for( Observer observer :  observers )
        {
            observer.notifyService(temperature);
        }
    }

}
