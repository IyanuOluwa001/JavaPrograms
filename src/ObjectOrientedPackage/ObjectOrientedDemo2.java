package ObjectOrientedPackage;

    /*
    Classes and Objects

    Class: This contains - attributes(properties), methods and constructors

    CONSTRUCTORS
    This is a special method in a class which can help us to create the object of the class.
    Note: A default constructor will be given to you whether you create it or not.
    Note: Immediately you create an object of a class, the constructor will be called automatically.
    Constructors can have parameter or not too.
    */

public class ObjectOrientedDemo2 {
    int x; //instance variable or attribute or field or property
    static int y = 25; //class variable or static variable

    //DEFAULT CONTRUCTORS

    public ObjectOrientedDemo2(){
        System.out.println("I am a non-param constructor");
    }

public ObjectOrientedDemo2(int x) {
        System.out.println("this is a parameterized constructor with int");
    }

    public ObjectOrientedDemo2(String y) {
        System.out.println("this is a parameterized constructor with string param");
    }


    public ObjectOrientedDemo2(int x, int y) {
        System.out.println("this is a constructor with two parameters");
    }

public void test(){
    System.out.println("this is a method in myschool class");
}

static void test1(){
    System.out.println("this is a test1 method");
}

public static void test2(){
    System.out.println("this is a test2 method");
}

}


