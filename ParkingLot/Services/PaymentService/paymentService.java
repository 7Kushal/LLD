package ParkingLot.Services.PaymentService;

public class paymentService {
    paymentStrategy paymentStrategy;
    public void setPaymentMethod(paymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
        System.out.println("Payment stategy is set to : " + paymentStrategy.getName());
    }
    public void makePayment(){
        paymentStrategy.pay();
    }
}