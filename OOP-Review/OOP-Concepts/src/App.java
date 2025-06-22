import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Giraffe;

public class App {
    public static void main(String[] args) throws Exception {

        // Inheritance
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        System.out.println("-------------------------");

        // Polymorphism / Abstraction / Encapsulation
        Animal doggy = new Dog();
        Animal kitty = new Cat();

        Animal animals[] = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        System.out.println("Dog says: "+ animals[0].getSound());
        System.out.println("Cat says: " + animals[1].getSound());

        speakAnimal(animals[0]);
        speakAnimal(animals[1]);

        // Cast the raw 'Animal' class to type 'Dog'
        ((Dog) doggy).digHole();

        // Cant access private method
        // ((Dog) doggy).PrivateMethod();
        ((Dog) doggy).accessPrivateMethod();

        Giraffe frank = new Giraffe();
        frank.setName("Frank");    

        System.out.println(frank.getName());
    }

    public static void speakAnimal(Animal animal){
        System.out.println(animal.getSound());
    }
}
