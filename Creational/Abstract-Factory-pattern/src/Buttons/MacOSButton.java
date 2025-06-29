package Buttons;

import Interfaces.Button;

public class MacOSButton implements Button {
    @Override
    public void drawButton() {
        System.out.println("Draw MacOS button!");
    }
}
