package MethodDemoPackage;

public class MethodDemo7 {
    //Recursion: this is when a method is calling itself)
    public static int sumOfNum(int x){
        int sum =0;
        if(x>0){
            sum = x + sumOfNum(x-1);
            return sum;
        }
        else{
            return sum;
        }
    }

    //Class Work: Factorial
    public static int sumOfNum2(int x){
        int sum =1;
        if(x>0){
            sum = x * sumOfNum2(x-1);
            return sum;
        }
        else{
            return sum;
        }
    }

    //Class Work: Power
    public static int sumOfNum3(int x) {
        int sum = 1;
        if (x > 0) {
            sum = x * sumOfNum3(x - 1);
            return sum;
        }
        else {
            return sum;
        }
    }

    public static int sumOfNum4(int x, int y){
        int sum = 1;
        if (x > 0) {
            sum = x * sumOfNum4(x-1,y-1);
            return sum;
        }
        else{
            return sum;
        }
    }

    /*
    Create a class
    create a method in the class (a variable we can call attribute)
    then create the object of the class then call the method directly using the object of the class

    sumOfNum(5) = 5 + sumOfNum(4) = 9
    sumOfNum(4) = 4 + sumOfNum(3) = 7
    sumOfNum(3) = 3 + sumOfNum(2) = 5
    sumOfNum(2) = 2 + sumOfNum(1) = 3
    sumOfNum(1) = 1 + sumOfNum(0) = 1 + 0

    sumOfNum(5) = 5 + 4 + 3 + 2 + 1 + 0 = 9
    sumOfNum(4) = 4 + 3 + 2 + 1 + 0 = 7
    sumOfNum(3) = 3 + 2 + 1 + 0 = 5
    sumOfNum(2) = 2 + 1 + 0 = 3
    sumOfNum(1) = 1 + sumOfNum(0) = 1 + 0
     */
    public static void main(String[] args) {
        //Recursion
        int result = sumOfNum(5);
        System.out.println(result);

        //Factorial
        int result1 = sumOfNum2(5);
        System.out.println(result1);

        //Power
        int result2 = sumOfNum3(8);
        System.out.println(result2);

        int result3= sumOfNum4(2,4);
        System.out.println(result3);
    }

}
