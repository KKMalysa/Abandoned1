package Building;

import notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Room implements Observable{
    private int number;
    private double currentTemperature;
    private double targetTemperature;
    private double cubature;
    //for observer:
    private TemperatureStatus temperatureStatus;
    private Set<Observer> registerObserver = new HashSet<Observer>();


    public Room(int number, double currentTemperature, double targetTemperature, double cubature, TemperatureStatus temperatureStatus) {
        this.number = number;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.cubature = cubature;
        this.temperatureStatus = temperatureStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public double getCubature() {
        return cubature;
    }

    public void setCubature(double cubature) {
        this.cubature = cubature;
    }


    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void unregisterObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
