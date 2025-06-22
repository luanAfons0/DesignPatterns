package Animals;

public abstract class Creature {
    protected int height;
    protected String name;

    public abstract void setName(String newName);
    public abstract String getName();
    public abstract void setHeight(int newHeight);
}
