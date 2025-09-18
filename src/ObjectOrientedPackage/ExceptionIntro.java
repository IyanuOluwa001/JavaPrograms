package ObjectOrientedPackage;

public class ExceptionIntro {
    public static void main(String[] args) {

        //Checked exception (example is BufferedReader)
        //Unchecked exception (examples are ArithmeticException etc).

        //Statements
        //1. Normal Statement: int x = 5;
        //2. Critical statement: k=i/j;

        int i, j, k;

        i = 50;
        j = 0;

        int nums[] = {10, 5, 6};
        //System.out.println(5/0);
        //System.out.println(num[7]);

        try {
            System.out.println("Hello, exception!");
            //k = i/j;
            //System.out.println("The value of k is "+k);
            System.out.println(nums[7]);
            System.out.println("Hello new exception");
        }

        catch (ArithmeticException e) {
            System.out.println("cannot divide by 0");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of range");
        }
    }
}