package Animals;

public class Dog extends Animal {
    public void digHole() {
        System.out.println("Dog dug a hole!");
    }

    public Dog(){
        super();
        this.setSound("Bark");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }

    public void accessPrivateMethod(){
        this.privateMethod();
    }
}
