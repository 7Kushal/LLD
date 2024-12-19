package Strategy;

public class driver {
    public static void main(String[] args) {
        context con = new context();
        con.setStrategy(new upi());
        con.makePayement();
        con.setStrategy(new credit());
        con.makePayement();
    }
}
