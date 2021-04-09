package notification;

import Building.Room;

// TODO: 09/04/2021
public class SystemMessage implements Observer{
    @Override
    public void update(Room room) {
        System.out.println("Temperature status: "  ); //dopisać status temperatury pobrany z pokoju

    }
}
