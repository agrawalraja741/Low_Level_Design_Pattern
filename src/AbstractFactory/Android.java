package AbstractFactory;

public class Android extends Platform{

    @Override
    PlatformFactory createPlatformFactory() {
        return  new AndroidPlatformFactory();
    }
}
