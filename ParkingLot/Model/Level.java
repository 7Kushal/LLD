package ParkingLot.Model;
import java.util.ArrayList;
import java.util.List;

public class Level {

    Integer levelNumber;
    List<Spot> spotList;
    public Level(Integer levelNumber, Integer noOfSpots){
        spotList = new ArrayList<>();
        this.levelNumber = levelNumber;
        for(int i=0;i<noOfSpots;i++)
        spotList.add(new Spot());
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for(Spot spot : spotList){
            if(spot.availibility && spot.spotType==vehicle.type)
            {spot.park(vehicle);
            return true;}
        }
        return false;
    }

    public boolean unPark(Vehicle vehicle) {
        for(Spot spot : spotList){
            if(spot.availibility == false && spot.getParkedVehicleNumber()==vehicle.vehicleNumber)
            {
                spot.unPark(vehicle);
                return true;
            }
        }
        return false;
    }
}
