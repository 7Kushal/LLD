// Strategy Interface
interface Strategy {
    public int execute(int a, int b);
}

// Concrete Strategy A: Addition
class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

// Concrete Strategy B: Subtraction
class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

 // Concrete Strategy C: Multiplication
class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

// Context
class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

// Client Code
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyAdd());
        System.out.println("Addition: " + context.executeStrategy(5, 3));

        context.setStrategy(new ConcreteStrategySubtract());
        System.out.println("Subtraction: " + context.executeStrategy(5, 3));

        context.setStrategy(new ConcreteStrategyMultiply());
        System.out.println("Multiplication: " + context.executeStrategy(5, 3));
    }
}
