package ParkingLot.Services.PaymentService;

public class UpiSrategy extends paymentStrategy{
    String name = "UPI";
    @Override
    public void pay() {
        System.out.println("Paying using UPI");
    }

    @Override
    protected String getName() {
        return this.name;
    }
    
}
