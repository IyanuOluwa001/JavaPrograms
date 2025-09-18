package ObjectOrientedPackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        //long num = 123456789009080898; //long won't accept a number this big

        BigInteger num1 = new BigInteger("43");
        BigInteger num2 = new BigInteger("423324323424234232342323234234233");
        BigInteger num3 = new BigInteger("56");
        BigInteger num4 = new BigInteger("33");

        System.out.println(num2);

        //We can't perform arithmetic operations on big integers e.g
        //System.out.println(num1+num2); //this will throw error

        //we do the arithmetic this way e.g
        System.out.println(num1.add(num3));
        System.out.println(num1.subtract(num3));

        int m = 5;
        int p = 4;

        //reminder
        /*
        if (m>p){
            System.out.println("hello there");
        }
        else {
            System.out.println("Hi you");
        }
         */

//This cannot work for BigInteger and BigDecimal
        /*
        if (num1>num3){
            System.out.println("Hello");
        }

        else {
            System.out.println("Hiii");
        }
         */

        BigInteger num5 = new BigInteger("35");
        BigInteger num6 = new BigInteger("35");

        System.out.println(num1.compareTo(num2));
    }




}
