package Observer;

import java.awt.image.ImageObserver;

public interface Publisher {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
