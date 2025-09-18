package ObjectOrientedPackage.InterfaceDemo;

public class ExceptionDemo5 {
    public static void main(String[] args) throws Exception {
        //Statements
        //1. Normal statement: int x = 5;
        //2. Critical statement

        int i, j;
        int k;
        i = 5;
        j = 2;

        try{
            k= i+j;
            if (k<10){
                //throw new ArithmeticException();
                throw new AptechException("No, nooo");
                //throw new Exception();
            }
            //System.out.println(k);
        }

        catch(ArithmeticException e){
            System.out.println("The value of k must not be less than 10");
        }

        /*
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No! something went wrong");
        }
        */

        /*
        catch (AptechException e){
            System.out.println("This is an error from aptech");
        }
        */

        /*
        catch (Exception e){

        }
        */
    }
}
