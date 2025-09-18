package ObjectOrientedPackage.AbstractPackage;

abstract class Tailor1{
    public void display(){
        System.out.println("Hello Abstract");
    }

    public abstract void display1();
}

/*
Note: it is not a must to have an abstract method inside an abstract class but is is a must to have an abstract class before
you can declare an abstract method.
 */

/*
class TryMe{
    int v = 45;
    //abstract void helloo(); //this cannot be here
}
*/

//Concrete class (any class that inherit an abstract class)
class Tailor2 extends Tailor1{
    @Override
    public void display1() {
        System.out.println("Hellooo, abstract method in Tailor2");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        //Tailor1 t = new Tailor1(); // we cannot instantiate an abstract class
        //Tailor2 t = new Tailor2();

        Tailor1 t = new Tailor2();

        //t.display1();
        //t.display()
    }
}
