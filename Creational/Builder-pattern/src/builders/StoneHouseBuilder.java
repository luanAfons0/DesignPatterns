package builders;

import Classes.House;
import interfaces.Builder;

public class StoneHouseBuilder implements Builder<House> {
    private String windows;
    private String doors;
    private String walls;
    private String floor;
    private String roof;

    @Override
    public void createWindows() {
        this.windows = "Stone style!";
    }

    @Override
    public void createDoors() {
        this.doors = "Stone style!";
    }

    @Override
    public void createWalls() {
        this.walls = "Stone style!";
    }

    @Override
    public void createFloor() {
        this.floor = "Stone style!";
    }

    @Override
    public void createRoof() {
        this.roof = "Stone style!";
    }

    public House getResult() {
        return new House(this.windows, this.doors, this.walls, this.floor, this.roof);
    }
}
