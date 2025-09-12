package ObjectOrientedPackage.Inheritance;

class Demo1{

    public Demo1(){
        System.out.println("This is a non param constructor in Demo1 class");
    }

    public Demo1(int i){
        System.out.println("This is an int param constructor in Demo1 class");
    }

    public Demo1(double i){
        System.out.println("This is a double param constructor in Demo1 class");
    }
}

class Demo2 extends Demo1{
    public Demo2(){
        super();
        System.out.println("This is a non param constructor in Demo2 class");
    }

    public Demo2(int i){
        super(9);
        System.out.println("This is an int param constructor in Demo2 class");
    }

    public Demo2(int i, int j ){
        System.out.println("This is an int param constructor in Demo2 class");
    }
}


public class InheritanceContructor {

    public static void main(String[] args) {
        //Demo1 d1 = new Demo1();
        //Demo1 dd1 = new Demo1(5);

        Demo2 d2 = new Demo2();
        //Demo2 d3 = new Demo2(7);
        //Demo2 d2 = new Demo2(3,5);
        //Demo2 d3 = new Demo2(4);
    }
}
