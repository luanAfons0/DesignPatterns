import Classes.House;
import builders.ModernHouseBuilder;
import builders.StoneHouseBuilder;
import builders.WoodHouseBuilder;
import directors.HouseDirector;
import interfaces.Director;

public class App {
    public static void main(String[] args) throws Exception {
        Director houseDirector = new HouseDirector();
        House houseBuilded;

        // Build the house with the modern builder
        ModernHouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        houseDirector.createHouse(modernHouseBuilder);

        // Get the build result from the modern builder and print it out
        houseBuilded = modernHouseBuilder.getResult();
        houseBuilded.getHouseInfos();
        System.out.println("\n------------------\n");

        // Build the house with the modern builder
        WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        houseDirector.createHouse(woodHouseBuilder);

        // Get the build result from wood house builder and print it out
        houseBuilded = woodHouseBuilder.getResult();
        houseBuilded.getHouseInfos();
        System.out.println("\n------------------\n");


         // Build the house with the modern builder
        StoneHouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        houseDirector.createHouse(stoneHouseBuilder);

        // Get the build result from wood house builder and print it out
        houseBuilded = stoneHouseBuilder.getResult();
        houseBuilded.getHouseInfos();
    }
}
