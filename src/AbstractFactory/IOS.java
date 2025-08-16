package AbstractFactory;

public class IOS extends Platform{

    @Override
    PlatformFactory createPlatformFactory() {
        return new IOSPlatformFactory();
    }
}
