package ObjectOrientedPackage.InterfaceDemo;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        //why finally block?
        //if you consider Exception class before other subclasses, what will happen?
        //Note: Exception class is a generic exception, that is, it is that superclass for all the exceptions.

        int i, j, k;
        i=50;
        j=0;

        int ar[] = {4,5,6};

        try{
            //k =i/j;
            //System.out.println("The value of k is "+k);
            System.out.println(ar[5]);
            //System.out.println("Good bye");
        }

        /*
        catch(Exception e){
        System.out.println("Something went wrong")'
         */

        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
            //System.out.println("Good bye");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of range");
            //System.out.println("Good bye");
        }

        /*
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        */

        finally{
            System.out.println("Good bye for now");
        }

        //Note: any code in finally block will surely be executed whether there is an error or not.
    }
}
