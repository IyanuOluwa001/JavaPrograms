package MethodDemoPackage;
import java.util.Arrays;

public class AssignmentClass {
//Non-parameterized method
    /*
    static void Method1(){
        System.out.println("My head don dey set");
    }

    public static String Method2(){
        String pas = "passion for Java";
        return pas;
    }

    public void Method3(){
        System.out.println("Eureka");
    }

    public double Method4(){
        return 8.9;
    }
    */

    public static void main(String[] args){
        //Non-Parameterized
        /*
        Method1();

        System.out.println(AssignmentClass.Method2());

        AssignmentClass jup = new AssignmentClass();
        jup.Method3();

        AssignmentClass pan = new AssignmentClass();
        System.out.println(pan.Method4());

        System.out.println();
        */

        //Parameterized
        /*
        Method5(9);

        System.out.println(AssignmentClass.Method6("poker"));

        AssignmentClass jupiter = new AssignmentClass();
        jupiter.Method7(9,"Winner");

        AssignmentClass panther = new AssignmentClass();
        System.out.println(panther.Method8(5.8f));
        */

        //Assignment
        //System.out.println(Arrays.toString(Method9(new int[]{2,3,4,5,6,7,8,9,91,67,16,900})));

        Method10("Canaan");
        Method11("canaan");

        String [] diva = {"a","e","i","o","u"};
        System.out.println(numberOfVowels("java is very cool"));
        //link(true);

    }
    //Parameterized method
    /*
    static void Method5(int x){
        System.out.println("My head don dey set again");
    }

    public static String Method6(String y){
        String pas = "plenty passion for Java";
        return pas;
    }

    public void Method7(int x, String y){
        System.out.println("Eureka Eureka");
    }

    public double Method8(float z){
        return 8.9;
    }
    */

    /*
    //program to print the sum of even of any given array argument
    public static int[] Method9 (int []div){
        //Program to print the sum of even numbers inside a given array of integers
        //div = new int[]{2,3,4,5,6,7,8,9,6,91,67,16,900};//worked:system recommended
        //int[] div = {348,23,23,24,23};        //not accepted
        //int [] div = new int[] {40,32,93,2};  //div, giving error


        int sum =0;
        //for (int i=0;i<div.length+1;i++){
            for(int x: div){
                if (x%2==0) {
                        System.out.println(x);
                }
                sum+=x;
            }

        return new int[]{sum};

    }
*/

    //Teachers Solution
    public static int sumOfEven(int[] nums){
        int sum = 0;
        for (int val:nums){
            if(val%2==0){
                sum+=val;
            }
        }
        return sum;
    }

    //Program to print the number of vowels in a given argument
    //Attempt 1
    public static void Method10(String x){
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        //while (c<x.length()){
        if (x.contains("u")){
            if (x.contains("o")) {
                if (x.contains("i")) {
                    if (x.contains("e")) {

                        if (x.contains("a")) {
                            c = c + 1;
                        }
                        else{c=0;}

                        d = d + c;
                    }
                    else {d=0;}

                    e = e + d;
                }
                else {e=0;}

                f = f + e;
            }
            else {f=0;}

            g= g + f;
        }
        else {g=0;}
        System.out.println("We have "+ g + " vowel in this string");
    }

    //Attempt 2
    public static void Method11(String x){
        int c = 0;
        if (x.contains("a")) {
            c = c + 1;
        }
        System.out.println("We have " + c + " vowel in this string");

    }

    //Teachers Solution
    public static String numberOfVowels(String word){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int sum = 0;
        for (int i=0; i<word.length(); i++){
            for (char test:vowels){
                if(word.charAt(i)==test){
                    sum+=1;
                }
            }
        }
        return "the number of vowels in the word " + word + " is: " + sum;
    }
    /*
    public static int Method12(String diva){

        for(int x: diva){

        }
        return c;

     */

    /*
    static boolean link(boolean k){
        System.out.println(k);
        return k;
    }
    */

}
