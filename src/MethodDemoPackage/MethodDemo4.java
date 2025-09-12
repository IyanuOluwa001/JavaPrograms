package MethodDemoPackage;

public class MethodDemo4 {
    //adding numbers
    public static double add1(int x,int y){
        return x+y;
    }

    public static int add11(double x,int y){
        return (int)(x+y);
    }
    public static double add2 (int x, int y, int z){
        return x+y+z;
    }

    public static double add3(int x, int y, int z, int k){
        return x+y+z+k;
    }

    public static double allAdd(int...val){
        double sum=0;
        for(int x:val){
            sum+=x;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Program to sum all the elements in an array
        /*
        int [] nums = {4,5,3,14};
        double sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        */

        //Program to sum all the elements in an array 2(enhanced for loop)
        int [] nums = {4,5,3,14};
        double sum = 0;
        for (int k:nums){
            sum+=k;
        }
        System.out.println(sum);

        System.out.println(sum);

        //printing methods() with parameters

        //System.out.println(MethodDemo4.add1(3,2));
        //System.out.println(MethodDemo4.add2(5,4,7));
        //System.out.println(MethodDemo4.add3(3,6,13,7));
        System.out.println(allAdd(3,4,5,64455,2323,2456,665,734,355));

    }

}
