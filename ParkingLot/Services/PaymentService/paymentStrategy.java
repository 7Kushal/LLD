package ParkingLot.Services.PaymentService;

public abstract class paymentStrategy {
    String name;
    // abstract void setName();
    abstract void pay();
    protected abstract String getName();
}
