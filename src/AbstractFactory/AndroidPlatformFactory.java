package AbstractFactory;

public class AndroidPlatformFactory implements PlatformFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AndroidTextBox();
    }
}
