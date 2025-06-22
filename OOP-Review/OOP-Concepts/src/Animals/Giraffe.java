package Animals;

public class Giraffe extends Creature {

    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    @Override
    public String getName(){
        return this.name;
    }
    
}