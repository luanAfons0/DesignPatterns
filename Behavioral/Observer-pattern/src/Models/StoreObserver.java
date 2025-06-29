package Models;


import Interfaces.Observer;
import Interfaces.Subject;

public class StoreObserver implements Observer {
    private static int observerTrackId = 0;
    private int observerId;

    private double flaskPrice;
    private double mousePrice;
    private double chairPrice;
    private Subject subject;

    public StoreObserver(Subject subject){
        this.subject = subject;
        this.subject.register(this);

        this.setupNewObserverId();
    }

    public void setupNewObserverId(){
        StoreObserver.observerTrackId = ++StoreObserver.observerTrackId;
        this.observerId = StoreObserver.observerTrackId;
    }

    @Override
    public void update(double flaskPrice, double mousePrice, double chairPrice) {
        this.flaskPrice = flaskPrice;
        this.mousePrice = mousePrice;
        this.chairPrice = chairPrice;
        this.showNewPrices();
    }

    public void showNewPrices(){
        System.out.println("Shop branch " + this.observerId);
        System.out.println("Flask price: " + this.flaskPrice);
        System.out.println("Mouse price: " + this.mousePrice);
        System.out.println("Chair price: " + this.chairPrice);
        System.out.println("-----------------------------");
    }
    
}
