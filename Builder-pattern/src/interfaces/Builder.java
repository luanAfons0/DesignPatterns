package interfaces;

public interface Builder<T> {
    public void createWindows();
    public void createDoors();
    public void createWalls();
    public void createFloor();
    public void createRoof();
    public T getResult();
}
