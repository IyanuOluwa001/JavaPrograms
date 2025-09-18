package ObjectOrientedPackage.InterfaceDemo;

//What type of interface is this

interface Book{
    public static final int x = 5;
    void show();

    default void show1(){
        System.out.println("This is a default method inside an interface");
    }

    default void show2(){
        System.out.println("This is a second default method inside an interface");
    }

    static void show3(){
        System.out.println("This is a static method is an interface");
    }
}

class Demo implements Book {
    public void show(){
        System.out.println("Helloo");
    }
}


public class InterfaceMethods {
    public static void main(String[] a) {
        Book b1 = new Demo();
        b1.show1();
        Book.show3();
        System.out.println(Book.x);
    }
}
