import Strategy.*;
public class Vehicle {
    DriveStrategy obj;
    Vehicle(DriveStrategy object){
        this.obj = object;
    }
    void drive(){
        obj.drive();
    };
}