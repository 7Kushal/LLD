package DesignPattern.FactoryPattern;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the type of object you want from the program --- ");
        String input = sc.next();
        sc.close();
        shape s1 = new shapeFactory().getShape(input.toUpperCase());
        if(s1!=null)
        s1.print();
        else
        System.out.println("Type correctly bro");
    }
}
