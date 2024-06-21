package DesignPattern.FactoryPattern;

public class shapeFactory {
    shape getShape(String input){
        switch (input) {
            case "CIRCLE":
            return new circle();
            case "RACTANGLE":
            return new ractangle();
            default:
            return null;
                // break;
        }
    }
}
