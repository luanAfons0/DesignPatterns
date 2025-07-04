package Animals;

import Interfaces.Flys;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String sound;
    public Flys flyingType;

    public String getName(){ return this.name; }
    public void setName(String newName){ this.name = newName; }

    public double getHeight(){ return this.height; }
    public void setHeight(double newHeight){ this.height = newHeight; }

    public double getWeight(){ return this.weight; }
    public void setWeight(int newWeight){ this.weight = newWeight; }

    public String getSound(){ return this.sound; }
    public void setSound(String newSound){ this.sound = newSound; }

    public String TryToFly(){
        return this.flyingType.fly();
    }

    public void setFlyingType(Flys newFlyingType){
        this.flyingType = newFlyingType;
    }
}