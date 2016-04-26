package main.java;

/**
 * Created by kasper on 09.04.16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, ich bin das Jenkins Demo Projekt.");
        System.out.println("Test: 4x4=");
        System.out.println(Utils.multiplyBy4(4));
        System.out.println("Test: 3 is even =");
        System.out.println(Utils.isEven(3));
        System.out.println("Demo Ende");
    }
}
