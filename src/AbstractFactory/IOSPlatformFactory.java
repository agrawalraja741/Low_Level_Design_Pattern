package AbstractFactory;

public class IOSPlatformFactory implements PlatformFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public TextBox createTextBox() {
        return new IOSTextBox();
    }
}
