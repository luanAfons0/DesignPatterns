import classes.Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("If you see the same value, then singleton was reused (yay!)");
        System.out.println("If you see different values, then 2 singletons were created (booo!!)");

        System.out.println("\nRESULT:\n");

        Singleton firstSingleton = Singleton.getInstance("FOO");
        Singleton secondSingleton = Singleton.getInstance("BAR");

        firstSingleton.getStringValue();
        secondSingleton.getStringValue();
    }
}
