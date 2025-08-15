package Observer;

public class ForcastService implements Observer {

    @Override
    public void notifyService(int temperature) {
        System.out.println("ForcastService = " + temperature);
    }
}
