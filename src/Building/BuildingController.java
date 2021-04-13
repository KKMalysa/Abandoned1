package Building;

public class BuildingController {
    private Building building;

    public BuildingController(Building building) {
        this.building = building;
    }

    public void controlLoop() {
        while (!building.keepTheTemperature()){
            System.out.println(building);
            building.checkTemperature();
            sleepOneSecond();
        }
        System.out.println(building);
        System.out.println("Each room has reached its target temperature");
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(1);  // default value 1000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
