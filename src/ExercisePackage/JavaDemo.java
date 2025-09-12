package ExercisePackage;

import java.util.Scanner;

class Trailer{
    public Trailer(){
        System.out.println("hello non param constructor");
    }

    public Trailer(int c){
        System.out.println("hello non int param constructor");
    }

    public Trailer(String name){
        System.out.println("hello a string param construcor");
    }

}
public class JavaDemo{
    public static void main(String[] args){

        Trailer t1 = new Trailer(5);
        Trailer t2 = new Trailer("Helooo");
        String name = new String ("helloo");
        Scanner sc = new Scanner(System.in);

    }
}
