package GoodCode;

public class MushrromPizza extends PizaaDecorator{
    BasePizza basePizza;
    MushrromPizza(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    int cost() {
        return this.basePizza.cost()+10;
    }
}
