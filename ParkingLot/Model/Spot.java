package ParkingLot.Model;

import java.util.UUID;

public class Spot {
    VehicleType spotType = VehicleType.BIKE;
    boolean availibility = true;
    String spotNumber;
    Vehicle vehicle;

    public Spot(){
        this.spotNumber = UUID.randomUUID().toString();
    }
    
    public Vehicle getParkedVehicle() {
        if(this.availibility==true)
        return vehicle;
        return null;
    }
    public void unPark(Vehicle vehicle) {
        this.availibility = true;
        vehicle =null;
    }
    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.availibility= false;
    }
    public Integer getParkedVehicleNumber() {
        return vehicle.getVehicleNumber();
    }
}
