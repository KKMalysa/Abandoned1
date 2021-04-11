package Building;

import AirConditioner.*;

import java.util.Random;

public class Building {

    private Room[] rooms;

    public Building (int numberOfRooms){
        rooms = new Room[numberOfRooms];
        generateRooms();
    }

    public void generateRooms(){
        Random random = new Random();
        for(int i=0; i<rooms.length; i++){
            int currentTemperature = 20 + random.nextInt(20); // 20-30 'C
            int targetTemperature  = 20 + random.nextInt(20);

            int volume = 10 + random.nextInt(10);
            AirConditioner airConditioner = getRandomAirConditioner();
            rooms[i] = new Room(i+1, currentTemperature, targetTemperature, volume, airConditioner);
        }
    }
    private AirConditioner getRandomAirConditioner() {
        Random random = new Random();
        double value = random.nextDouble();
        if(value < 0.5)
            return new BasicAirConditioner();
        else
            return new ProAirConditioner();
    }

    public void checkTemperature(){
        for (Room room : rooms){
            room.temperatureKeeper();
        }
    }

}
