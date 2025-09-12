package MethodDemoPackage;
//Methods are reusable outside the package we

public class MethodDemo6 {
    //Program to print multiplication table for an argument passed in a method
    //My Solution
    public static void classAssignment1(int x){
        int sum = 12;
        for (int i=1; i<sum+1; i++){
            int mult=x*i;
            System.out.println(x + "x" + i +" = " +mult);
        }
    }

    //Teachers Solution
    public static void table(int x){
        for(int i=1; i<=12; i++){
            System.out.println(x + "x" + i + "=" + x*i);
        }
    }

    public static void main(String[] args) {
        classAssignment1(5);

        table1(17);
        System.out.println();

        System.out.println(addNum(1,19));
        System.out.println();

        System.out.println(addEvenNum(1,53));
        System.out.println();

        int[] val1 = {2,3,6,34,6,34,34,23,46,7,72,89};
        System.out.println(addEvenNumArray(val1));
    }

    //Program to print the sum of all values from a number to a particular number using method
    public static int addNum(int x, int y){
        int my_sum=0;
        for(int i=x; i<=y; i++){
            my_sum+=1;
        }
        return my_sum;
    }


    //Program to print the sum of all even numbers from a number to a particular number using method
    public static int addEvenNum(int x, int y){
        int my_sum = 0;
        for(int i=x; i<=y; i++){
            if(i%2==0){
                my_sum+=1;
            }
        }
        return my_sum;
    }


    //Program to print multiplication table of any number
    public static void table1(int x){
        for (int i=1; i<=12; i++){
            System.out.println(x + "x" + i+"="+x*i);
        }
    }

    //Program to all all odd numbers from an array of integer using method
    public static int addEvenNumArray(int[] nums){
        int my_sum = 0;
        for(int j:nums){
            if(j%2!=0){
                my_sum+=j;
            }
        }
        return my_sum;
    }

}
