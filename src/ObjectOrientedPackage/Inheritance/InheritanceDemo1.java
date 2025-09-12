package ObjectOrientedPackage.Inheritance;

/*
Access and Non Access Modifiers;

Access Modifiers;
1. for class, we have default, public
2. for methods, attributes and constructors, we have public, default, private and protected

Non Access modifiers;
1. for class(abstract, final): when you use abstract keyword with a class, that means you cannot create the object of the class,
to create the object of the class, we must create a class that will inherit it. Also, when we use final keyword with a class,
that means we cannot inherit the class.

2. for methods and variables(final, abstract, static); when we use final keyword with a method that means we cannot override
the method. When we use abstract keyword with a method, that means we cannot define the body of the method, to define the body
of that method, we need to create a subclass that will inherit that class where abstract method exist.

When you use final keyword with a variable, that means that you cannot change the value of the variable, that is it has become
a constant.

When we use final keyword with a class, then that means we cannot inherit the class.

OOP concepts: encapsulation, inheritance, abstraction and polymorphism
 */

class Transport{
    public void addMethod(int x, int y){
        System.out.println(x+y);
    }

    public void subMethod(int x, int y){
        System.out.println(x-y);
    }
}
public class InheritanceDemo1 {
    public static void main(String[] args) {
        //final variable become constant
        int x = 23;
        //final int x =24;
        //final int y = 12;
        x = 45; //this variable was accepted because the initial x was not final

        //Transport t = new transport();
        //t.addMethod(4,6);

        //Horse h = new Horse();
        //h.addMethod(12,13);
    }
}
