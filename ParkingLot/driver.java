package ParkingLot;
import ParkingLot.Model.Level;
import ParkingLot.Model.ParkingLot;
import ParkingLot.Model.Vehicle;
import ParkingLot.Model.VehicleType;
import ParkingLot.Services.PaymentService.UpiSrategy;
import ParkingLot.Services.PaymentService.paymentService;

public class driver {

    public static void main(String[] args) {
        // paymentService paymentService = new paymentService();
        // paymentService.setPaymentMethod(new UpiSrategy());
        // paymentService.makePayment();

        ParkingLot parkingLot = ParkingLot.instanceParkingLot();
        parkingLot.addLevel(new Level(1,2));
        Vehicle v1 = new Vehicle(1234,"RED",VehicleType.BIKE);
        Vehicle v2 = new Vehicle(1243,"BLUE",VehicleType.BIKE);
        Vehicle v3 = new Vehicle(4234,"GREEN",VehicleType.BIKE);

        parkingLot.chechAvail();
        parkingLot.parkVehicle(v1);
        parkingLot.parkVehicle(v2);
        // parkingLot.parkVehicle(v3);

        parkingLot.unPark(v2);
        parkingLot.chechAvail();
    }
}