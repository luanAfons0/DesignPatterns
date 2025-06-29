package builders;

import Classes.House;
import interfaces.Builder;

public class ModernHouseBuilder implements Builder<House> {
    private String windows;
    private String doors;
    private String walls;
    private String floor;
    private String roof;

    @Override
    public void createWindows() {
        this.windows = "Modern!";
    }

    @Override
    public void createDoors() {
        this.doors = "Modern!";
    }

    @Override
    public void createWalls() {
        this.walls = "Modern!";
    }

    @Override
    public void createFloor() {
        this.floor = "Modern!";
    }

    @Override
    public void createRoof() {
        this.roof = "Modern!";
    }

    public House getResult() {
        return new House(this.windows, this.doors, this.walls, this.floor, this.roof);
    }
}
