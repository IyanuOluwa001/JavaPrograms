package ObjectOrientedPackage.InterfaceDemo;

interface MyDemo{
    void show();
    void show1();
}

/*
class Test implements MyDemo{
    public void show(){
        System.out.println("This is a pen in Test class");
    }
}
*/



public class AnonymousInterface{
    public static void main(String[] a) {
        //MyDemo dem1 = new Test();
        //Test t1 = new Test();
        //MyDemo dem1 = new MyDemo();

        MyDemo dem1 = new MyDemo()

        {
            public void show(){
                System.out.println("This is a show method in anonymous class");
            }

            public void show1(){
                System.out.println("This is a show in anonymous2 class");
            }
        };
        dem1.show();
        dem1.show1();
    }
}

