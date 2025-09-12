package ObjectOrientedPackage;

//  OOP (Object Oriented Programming)
    /*
        Classes and Objects
        Inside a class, we can have
        - attributes(properties), methods and constructors
        Note: A class is a blueprint of an object, we can create instance/object of a class.
     */

import java.util.Scanner;

class RealJava {
    int x; //instance or non-static variable or attribute or field of property
    static int y = 25; //class or static variable

    //This method is a non-static or instance method i.e we must create the object of the class before calling it


    public void method1() {
        System.out.println("this is a non-static method1 in RealJava class");
    }

    public static int method2() {
        System.out.println("this is a static method2 in RealJava class");
        //this is a static method or class method i.e we don't need to create the object to call it, just call it directly. It belongs to the class
        return 6;
    }

}


    public class ObjectOrientedDemo1 {


        public static void main(String[] args) {

            //RealJava obj1 = new RealJava();
            //obj1.method1();

            //RealJava.method2();
            //obj1.test();

            /*Scanner val = new Scanner(System.in);
            System.out.println("enter something");

            String stack = val.nextLine();*/

            //System.out.println(test(stack));

            System.out.println(test(""));

            //ObjectOrientedDemo2 obj = new ObjectOrientedDemo2();
            //ObjectOrientedDemo2 obj1 = new ObjectOrientedDemo2(3);
            //ObjectOrientedDemo2 obj2 = new ObjectOrientedDemo2("helooo");

            //ObjectOrientedDemo2 obj3 = new ObjectOrientedDemo2(3,6);
            //obj3.test();

           //ObjectOrientedDemo2.test1();
           //ObjectOrientedDemo2.test2();

        }

        public static String test(String lang){


            Scanner val = new Scanner(System.in);
            System.out.println("enter something");
            lang = val.nextLine();


            return "the language I love most is:"+ lang;
        }
    }



