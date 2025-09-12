package ObjectOrientedPackage;

class Aptech1{
    public void show(){
        System.out.println("Hello, this is a show method in Aptech1 class");
    }

    public void show2(){
        System.out.println("Hi, this is show2 method in Aptech1 class");
    }
}

class Aptech2 extends Aptech1{
    public void show(){
        System.out.println("This is show3 in Aptech2 class");
    }

    public void show4(){
        System.out.println("This is show4 in Aptech2 class");
    }
}

class Aptech3 extends Aptech1{
    public void show(){
        System.out.println("This is a show method in Aptech3 class with an update");
    }

    public void show5(){
        System.out.println("This is a show5 method in Aptech1 class");
    }
}

public class ReferenceObject {
    public static void main(String[] args) {
        //Aptech2 obj = new Aptech2();
        //obj.show();

        Aptech1 obj = new Aptech2();
        //obj = new Aptech3(); //Dynamic method Dispatch (another example of a polymorphism)
        obj.show();

        //obj.show3();
        //a2.show3();
        //obj.show1();

        //Note: in general, when dealing with reference of a parent class and object of a child class
        //any method we want to call must either be in both classess or must be in parent class alone.

    }
}
