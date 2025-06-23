package Enemies;

public abstract class Enemy {
    private String name;
    private double speed;
    private double damage;

    public void setName(String newName) { this.name = newName; };
    public String getName() { return this.name; };

    public void setSpeed(double newSpeed) { this.speed = newSpeed; };
    public double getSpeed() { return this.speed; };

    public void setDamage(double newDamage) { this.damage = newDamage; };
    public double getDamage() { return this.damage; };
}