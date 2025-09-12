package MethodDemoPackage;
import java.util.Arrays;

public class MethodDemo2 {
    //2. Parameterized method which are static

    public static void method1(int x){
        System.out.println("Hello Mr. Parametered with int");
    }

    public static void method1b(int x){
        System.out.println("Hello Mr. Parametered with int:"+x);
    }

    public static void method2(String val){
        System.out.println("Hello Mr. Parametered with String");
    }

    public static void method3(int x, float y){
        System.out.println("Hello Mr. Parametered with int and float");
    }

    public static int method4(int x, int y){
        return x+y;
    }

    public static double method5(int x, double y){
        return x+y;
    }

    //Note: It is possible to call a static class in a non static class. We will get to it.
    public static void main(String[] args){

        method1(590);
        method1b(876);
        method2("great grace");
        method3(500,6.9f);
        System.out.println(MethodDemo2.method4(4,9)); //result: 11
        System.out.println(MethodDemo2.method5(21,43.3));
        MethodDemo2 var = new MethodDemo2();

        //Calling methods below the main method
        var.helloMethod("James",21);



    }

    void helloMethod (String name, int Age){
        System.out.println("the name is:" + name+"and the age is:"+Age);
    }

}
