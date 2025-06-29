package Factories;

import Interfaces.Button;
import Interfaces.CheckBox;
import Interfaces.GUIFactory;

public class ApplicationGUIFactory {
    private Button button;
    private CheckBox checkBox;
    private GUIFactory guiFactory;

    public ApplicationGUIFactory(GUIFactory guiFactory){
        this.guiFactory = guiFactory;
        this.button = this.guiFactory.createButton();
        this.checkBox = this.guiFactory.createCheckBox();
    }

    public void drawUI(){
        this.button.drawButton();
        this.checkBox.drawCheckBox();
    }
}
