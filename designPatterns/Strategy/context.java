package Strategy;

/**
 * context
 */
public class context {

    strategy currenStrategy;

    public void setStrategy(strategy currenStrategy){
        this.currenStrategy = currenStrategy;
    }

    public void makePayement(){
        System.out.println("Paying using " + currenStrategy.getClass().getName());
    }
    
}