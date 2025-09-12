package ObjectOrientedPackage.Inheritance;

class Test1{
    public void display(){
        System.out.println("hello display in test 1");
    }

    public void show(){
        System.out.println("hello display in test1 class");
    }

    public void newShow(){
        System.out.println("hello show method in test1 class");
    }
}

class Test2 extends Test1 {

    @Override
    public void display(){
    System.out.println("Hello, display in Test2 class");
}

@Override
public void show(){
        super.show();
    System.out.println("Hello, show method in test2 class");
}


}
public class InheritanceDemo4 {

    public static void main(String[] args) {

        Test2 t = new Test2();
        t.display();
        //t.show();
    }
}
