package ObjectOrientedPackage.InterfaceDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo4 {
    //Intro to throws keyword to suppress exception
    //Note: we always use throws keyword with a method.

    public static void main(String[] args) throws IOException {
        /*
        int i, j;
        i = 50;
        j = 10;
         */

        //InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ar[] = {4, 5, 6};

        System.out.println("Enter i:");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Enter j:50");
        int j = Integer.parseInt(br.readLine());

        int k = i/j;
        /*
        try{
            System.out.println("enter i:");
            int i = Integer.parseInt(br.readLine());
            System.out.println("Enter j:50");
            int j = Integer.parseInt(br.readLine());

            int k = i/j;
         */

        /*
        } catch (Exception e) {
            System.out.println("no this is not the expected data type");
        }
        */


    }
}
