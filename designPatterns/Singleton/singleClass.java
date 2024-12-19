package Singleton;

public class singleClass {
    static singleClass object;
    static singleClass getInstance(){
        if(object==null){
            synchronized (singleClass.class) {
            object = new singleClass();
            }
        }
        return object;
    }

    singleClass(){
        System.out.println("New Obejct");
    }
}
