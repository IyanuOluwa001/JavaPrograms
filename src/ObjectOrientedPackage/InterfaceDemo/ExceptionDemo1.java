package ObjectOrientedPackage.InterfaceDemo;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int i, j, k;
        i=50;
        j=0;

        int ar[] = {4, 5, 6};

        try{
            //k = i/j;
            //System.out.println("The value of k is "+k);
            System.out.println(ar[5]);
        }

        /*
        catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
       */

        /*
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of range");
        }
        */

        catch (ArithmeticException|ArrayIndexOutOfBoundsException e1){
            //System.out.println("cannot divide by 0");
            System.out.println("Hello, on exception");
        }
    }
}
