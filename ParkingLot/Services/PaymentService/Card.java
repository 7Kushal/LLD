package ParkingLot.Services.PaymentService;

public class Card extends paymentStrategy{
    String name = "Card";
    @Override
    public void pay() {
        System.out.println("Payed using credit card");
    }
    @Override
    protected String getName() {
        return this.name;
    }
}
