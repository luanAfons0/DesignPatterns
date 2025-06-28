package builders;

import Classes.House;
import interfaces.Builder;

public class WoodHouseBuilder implements Builder<House> {
    private String windows;
    private String doors;
    private String walls;
    private String floor;
    private String roof;

    @Override
    public void createWindows() {
        this.windows = "Wood style!";
    }

    @Override
    public void createDoors() {
        this.doors = "Wood style!";
    }

    @Override
    public void createWalls() {
        this.walls = "Wood style!";
    }

    @Override
    public void createFloor() {
        this.floor = "Wood style!";
    }

    @Override
    public void createRoof() {
        this.roof = "Wood style!";
    }

    public House getResult() {
        return new House(this.windows, this.doors, this.walls, this.floor, this.roof);
    }
}
