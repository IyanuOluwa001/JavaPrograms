package ObjectOrientedPackage.InterfaceDemo;

@FunctionalInterface
interface MyDemo1{
    void show();
}

public class InterfaceWithLambda {
    public static void main(String[] args) {

        /*
        MyDemo1 = new MyDemo1()
        {
            public void show(){
                System.out.println("Hello, my method is anonymous interface again");
            }
        };
        dem.show();
        */

        //MyDemo1 dem = () -> System.out.println("Hello, my method is lambda expression again");
        //dem.show();

        MyDemo1 demo = ()->
        {
            System.out.println("Hello, my name is lambda expression");
            System.out.println("Hello, my method in lambda expression again");
            System.out.println("Hello, my method is lambda expression once last time");
        };
        demo.show();
        //In summary, before you can implement a lambda expression, the interface must be a functional interface.
    }
}
