package Animals;

import Interfaces.Flys;

public class CantFly implements Flys {

    @Override
    public String fly() {
        return "cant fly...";
    }
    
}
