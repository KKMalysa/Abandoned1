package notification;

import Building.Room;

// TODO: 09/04/2021
public class SystemMessage implements Observer{
    @Override
    public void update(Room room) {
        System.out.println("Temperature status in room No.  " + room.getRoomNumber() + "has been changed in to: " + room.getTemperatureStatus());

    }
}
