package ObjectOrientedPackage.Inheritance;

// Inheritance
// 5 types of inheritance (single level, multilevel, multiple, hierachical and hybrid)
// Note: the object of a subclass (child class) is also an object of a superclass (parent class).

//The super class or the parent class is the one that has properties to be inherited
//The sub-class or child class or derived class is the one that is inheriting a property
//We have single level inheritance(one parent and one child class)

class FirstCompute {
    static int x = 5;

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }
}
    /*
    //Without inheritance, the following is how cluncky code can be with redundancy/repetition happening everywhere.

    class SecondCompute{
        static int add(int x, int y){
            return x+y;
        }
        static int sub(int x, int y){
            return x-y;
        }

        static int mut(int x, int y){
            return x*y;
        }

        static double div (double x, int y){
            return x/y;
        }
    }
     */

class SecondCompute extends FirstCompute{
    static int mut (int x, int y){
        return x*y;
    }

    static double div(double x, int y){
        return x/y;
    }
}

public class Inheritanceintro {
    public static void main(String[] args) {
        System.out.println(FirstCompute.add(3,8));
        System.out.println(SecondCompute.mut(40,317));
        System.out.println(SecondCompute.div(40,1));
        System.out.println(SecondCompute.sub(40,317));
    }
}
