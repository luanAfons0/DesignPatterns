package Classes;

public class House {
    private String windowsType;
    private String doorsType;
    private String wallsType;
    private String floorType;
    private String roofType;

    public House(String windowsType, String doorsType, String wallsType, String floorType, String roofType){
        this.windowsType = windowsType;
        this.doorsType = doorsType;
        this.wallsType = wallsType;
        this.floorType = floorType;
        this.roofType = roofType;
    }

    public void getHouseInfos(){
        System.out.println(String.format("Windows type is: %s", this.windowsType));
        System.out.println(String.format("Doors type is: %s", this.doorsType));
        System.out.println(String.format("Walls type is: %s", this.wallsType));
        System.out.println(String.format("Floor type is: %s", this.floorType));
        System.out.println(String.format("Roof type is: %s", this.roofType));
    }
}
