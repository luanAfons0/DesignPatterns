import java.util.Scanner;

import Factories.ApplicationGUIFactory;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String osType;
        ApplicationGUIFactory applicationGUIFactory;

        System.out.println("Which OS you are using?");
        System.out.println("Linux");
        System.out.println("Windows");
        System.out.println("MacOS");

        osType = scanner.nextLine();

        applicationGUIFactory = AppGUI.configureAppGUI(osType);

        System.out.println("-------------------------");
        applicationGUIFactory.drawUI();
        scanner.close();
    }
}
