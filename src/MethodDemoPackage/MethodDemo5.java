package MethodDemoPackage;

public class MethodDemo5 {
    /*
    Polymorphism
    Polymorphism means many forms, that is when something appears in many ways.

    TWO TYPES OF POLYMORPHISM
    STATIC or COMPILE TIME POLYMORPHISM: example is method overloading and constructor overloading
    DYNAMIC or RUN TIME POLYMORPHISM: method overriden
     */

    //METHOD OVERLOADING:this is when the same method is being used for different task
    static float projectMethod1(int num1, float num2){
        return num1+num2;
    }

    static int projectMethod1(int num1, int num2){
        return num1 + num2;
    }

    static int projectMethod1(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    static double projectMethod1(int num1, long num2){
        return num1+num2;
    }

    static String projectMethod1(int num1){
        return "my age is " +num1;
    }

    public static void main(String[] args) {
        System.out.println(projectMethod1(4));
    }

}
