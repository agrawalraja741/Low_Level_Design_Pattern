package AbstractFactory;

public class Client {
    public static void main(String[] args) {

        Platform android = new Android();
        PlatformFactory factory = android.createPlatformFactory();
        factory.createButton();
        factory.createTextBox();

        Platform IOS = new IOS();
        PlatformFactory factory1 = IOS.createPlatformFactory();
        factory1.createButton();
        factory1.createTextBox();

    }
}
