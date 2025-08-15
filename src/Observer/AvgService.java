package Observer;

public class AvgService implements Observer {

    @Override
    public void notifyService(int temperature) {
        System.out.println( "AvgService = " + temperature);
    }
}
