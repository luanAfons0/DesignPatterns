package Factories;

import Buttons.MacOSButton;
import CheckBox.MacOSCheckBox;
import Interfaces.Button;
import Interfaces.CheckBox;
import Interfaces.GUIFactory;

public class MacOSGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
