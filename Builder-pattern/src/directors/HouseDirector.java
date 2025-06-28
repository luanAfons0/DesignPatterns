package directors;

import interfaces.Builder;
import interfaces.Director;

public class HouseDirector implements Director {
    @Override
    public void createHouse(Builder<?> builder) {
        builder.createDoors();
        builder.createFloor();
        builder.createRoof();
        builder.createWalls();
        builder.createWindows();
    }
}
