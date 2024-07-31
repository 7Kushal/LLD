package GoodCode;

public class main {
    public static void main(String[] args) {
        BasePizza pizza = new MushrromPizza(new ChessPizza(new Margerita()));
        System.out.println(pizza.cost());
    }
}
