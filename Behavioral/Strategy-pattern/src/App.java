import Animals.Bird;
import Animals.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Bird is " + bird.TryToFly());
        System.out.println("Dogs " + dog.TryToFly());
    }
}
