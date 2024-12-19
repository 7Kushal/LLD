package ParkingLot.Model;

public class Vehicle {
    Integer vehicleNumber;
    String color;
    VehicleType type;
    Level level;
    Spot spot;
    public Vehicle(Integer vehicleNumber,String color,VehicleType type){
        this.vehicleNumber =vehicleNumber;
        this.color =color;
        this.type= type;
    }
    public Level getLevel() {
        return level;
    }
    public void setLevel(Level level) {
        this.level = level;
    }
    public Spot getSpot() {
        return spot;
    }
    public void setSpot(Spot spot) {
        this.spot = spot;
    }
    public Integer getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public VehicleType getType() {
        return type;
    }
    public void setType(VehicleType type) {
        this.type = type;
    }  
}
