package Animals;

import Interfaces.Flys;

public class ItFlys implements Flys {
    @Override
    public String fly() {
        return "flying hight!";
    }
}
