package ObjectOrientedPackage.InterfaceDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExceptionDemo3 {
    public static void main(String[] args) {
        //Statements
        //1. Normal statement: int x=5;
        //2. Critical statement

        int i, j, k;
        i=50;
        j=0;

        //InputStreamReader inp = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(inp);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int num = br.readLine();
        int ar[] = {4, 5, 6};
        try{
            System.out.println("Enter your name");
            String name1 = String.valueOf(br.read());
            System.out.println("Enter i;");
            i = Integer.parseInt(br.readLine());
            System.out.println("My num is "+i);
            System.out.println("Enter j:");
            j = Integer.parseInt(br.readLine());

            //k=i/j;
            //System.out.println("The value of k is "+k);
            //System.out.println(ar[4]);
        }

        catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }

        catch (NumberFormatException n){
            System.out.println("Wrong data");
            //n.getMessage();
        }

        /*
        catch (ArithmeticException|ArrayIndexOutOfBoundsException e1){
            //System.out.println("cannot divide by 0");
            System.out.println("Hello, an exception");
        }
        */

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of range");
        }

        catch (IOException e){
            System.out.println("No, this is not the expected data type");
        }

        catch (Exception e){
            System.out.println("Something went wrong");
        }

        /*
        finally{
            if (i>j){
                System.out.println("Goodbye for now");
            }

            else{
                System.out.println("Goodbye finally");
            }
        }
        */
    }
}
