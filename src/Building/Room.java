package Building;

import notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Room implements Observable{
    private int RoomNumber;
    private double currentTemperature;
    private double targetTemperature;
    private double cubature;
    //for observer:
    private TemperatureStatus temperatureStatus;
    private Set<Observer> registeredObserver = new HashSet<Observer>();


    public Room(int RoomNumber, double currentTemperature, double targetTemperature, double cubature) {
        this.RoomNumber = RoomNumber;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.cubature = cubature;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.RoomNumber = roomNumber;
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

    public TemperatureStatus getTemperatureStatus() {
        return temperatureStatus;
    }

    public void setTemperatureStatus(TemperatureStatus temperatureStatus) {
        this.temperatureStatus = temperatureStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObserver.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : registeredObserver){
            observer.update(this);
        }

    }

    public void changeTemperatureStatus(TemperatureStatus temperatureStatus){
        setTemperatureStatus(temperatureStatus);
        notifyObservers();
    }
}
