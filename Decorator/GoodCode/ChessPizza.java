package GoodCode;

public class ChessPizza extends PizaaDecorator{
    BasePizza basePizza;
    ChessPizza(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    int cost() {
        // TODO Auto-generated method stub
        return this.basePizza.cost()+10;
    }
}
