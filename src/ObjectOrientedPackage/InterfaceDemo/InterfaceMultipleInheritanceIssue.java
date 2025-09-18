package ObjectOrientedPackage.InterfaceDemo;

interface FirstInterface{
    int val = 12; //public static final

    default void show(){
        System.out.println("This is a method in the first interface");
    }
}

interface SecondInterface{

    default void show(){
        System.out.println("This is a method in the second interface");
    }
}


public class InterfaceMultipleInheritanceIssue {
}
