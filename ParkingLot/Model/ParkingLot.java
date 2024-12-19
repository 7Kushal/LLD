package ParkingLot.Model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Level> levelList;
    private static ParkingLot parkingLot;
    public static synchronized ParkingLot instanceParkingLot(){
        if(parkingLot==null)
        parkingLot = new ParkingLot();
        return parkingLot;
    }
    
    public ParkingLot() 
    {
        levelList = new ArrayList<>();
    }
    public void chechAvail(){
        for(Level level : levelList){
            for(Spot spot : level.spotList){
            System.out.println("Level = " + level.levelNumber + " Slot number = " + spot.spotNumber + " is availible : " + spot.availibility );
            }
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(Level level : levelList){
            if(level.parkVehicle(vehicle))
            return true;
        }
        return false;
    }

    public boolean unPark(Vehicle vehicle){
        for(Level level : levelList){
            if(level.unPark(vehicle)){
            return true;}
            }
        return false;
    }

    public void addLevel(Level level) {
        levelList.add(level);
    }
}
