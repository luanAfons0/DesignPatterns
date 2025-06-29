package Factories;

import Buttons.LinuxButton;
import CheckBox.LinuxCheckBox;
import Interfaces.Button;
import Interfaces.CheckBox;
import Interfaces.GUIFactory;

public class LinuxGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
