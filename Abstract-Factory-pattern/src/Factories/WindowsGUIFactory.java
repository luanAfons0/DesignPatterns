package Factories;

import Buttons.WindowsButton;
import CheckBox.WindowsCheckBox;
import Interfaces.Button;
import Interfaces.CheckBox;
import Interfaces.GUIFactory;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
