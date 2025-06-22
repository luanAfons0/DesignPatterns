package Animals;

public class Bird extends Animal {
    public void teste(){
        System.out.println("Teste aqui");
    }

    public Bird(){
        this.flyingType = new ItFlys();
    }
}
