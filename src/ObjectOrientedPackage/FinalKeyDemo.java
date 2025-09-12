package ObjectOrientedPackage;

class Method1{

    public void methodA(){
        System.out.println("Helloo method A in Method class");
    }

    //We cannot override a final method
    public final void methodB(){
        System.out.println("Helloo final method B in Method class");
    }
}

//We cannot inherit a final class
final class Method2 {

    public void myMethod1() {
        System.out.println("Helloo, new method in final Method2 class");
    }
}


class Method3 extends Method1{

    public void methodA(){
        System.out.println("Helloo, new method  in Method class");
    }
}

public class FinalKeyDemo {
    public static void main(String[] args) {
        //We cannot assign new value to a final variable

        //The two lines below demonstrates that if we have a final int num, num =23 is not possible.
        final int num = 7;
        //num = 23;
        final int val;
        val = 34;
    }
}
