package MethodDemoPackage;
import java.util.Arrays;

public class MethodDemo3 {
    public void method1(){
        System.out.println("This is a method1 and it is non-static");
    }

    public static void main(String[] args) {
        MethodDemo3 val = new MethodDemo3();
        val.method1();
        System.out.println();

        System.out.println(Arrays.toString(MethodDemo3.newMethod())); //Called it using the class
        System.out.println(Arrays.toString(newMethod())); //Called it using the object of the class
        System.out.println();

        int [][] numbers = {{3,5,6},{34,56,9}}; //definition of the variable
        System.out.println(Arrays.deepToString(val.newMethod1(numbers)));
        System.out.println();


        //System.out.println(Arrays.toString(Method9(new int[]{2,3,4,5,6,7,8,9,91,67,16,900})));


    }

    public static String[] newMethod(){
        String[] langs = {"python", "java"};
        return langs;
    }

    public int [][] newMethod1(int [][]nums){
        return nums;
    }

}
