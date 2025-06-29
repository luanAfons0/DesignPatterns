import Factories.ApplicationGUIFactory;
import Factories.LinuxGUIFactory;
import Factories.MacOSGUIFactory;
import Factories.WindowsGUIFactory;
import Interfaces.GUIFactory;

public class AppGUI {
 
    public static ApplicationGUIFactory configureAppGUI(String osType){
        GUIFactory guiFactory;

        switch (osType) {
            case "Windows":
                guiFactory = new WindowsGUIFactory();
                break;

            case "MacOS":
                guiFactory = new MacOSGUIFactory();
                break;
        
            default:
                guiFactory = new LinuxGUIFactory();
                break;
        }

        return new ApplicationGUIFactory(guiFactory);
    }   
}