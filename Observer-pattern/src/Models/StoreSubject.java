package Models;

import java.util.ArrayList;

import Interfaces.Observer;
import Interfaces.Subject;

public class StoreSubject implements Subject {
    private ArrayList<Observer> observers;
    private double flaskPrice;
    private double mousePrice;
    private double chairPrice;

    public StoreSubject(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        int observerIndex = this.observers.indexOf(observer);
        this.observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.flaskPrice, this.mousePrice, this.chairPrice);
        }
    }

    public void updateFlaskPrice(double newFlaskPrice){
        this.flaskPrice = newFlaskPrice;
        this.notifyObservers();
    }

    public void updateMousePrice(double newMousePrice){
        this.mousePrice = newMousePrice;
        this.notifyObservers();
    }

    public void updateChairPrice(double newChairPrice){
        this.chairPrice = newChairPrice;
        this.notifyObservers();
    }
}
