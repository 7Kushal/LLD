package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class driver {

    public static void main(String[] args) {
        // singleClass object = singleClass.getInstance();
        // singleClass object2= singleClass.getInstance();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(()->singleClass.getInstance());
        executor.execute(()->singleClass.getInstance());
        executor.shutdown();
        // System.out.println(object.hashCode());
        // System.out.println(object2.hashCode());

    }
}