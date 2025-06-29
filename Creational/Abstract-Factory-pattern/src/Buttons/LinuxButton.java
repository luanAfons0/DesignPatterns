package Buttons;

import Interfaces.Button;

public class LinuxButton implements Button {
    @Override
    public void drawButton() {
        System.out.println("Draw Linux button!");
    }
}
