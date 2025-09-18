package ModifierPackage2;

public class Demo1 {
    int x = 7; // that is we cannot access it outside the package
    public int x1 = 7; //global access
    private int t = 14; //we can access this only inside its class or through encapsulation
    protected int m = 12; //we can access this inside its class, inside another class in the same package
    //and in subclass inside the same package or outside the package

    void showMethod(){
        System.out.println(m);
        System.out.println("This is the first show method");
    }

    public void show(){
        show1();
        System.out.println("This is a show method which is public");
    }

    private void show1(){
        System.out.println("This is a show1 method and it is private");
    }

    protected void show2(){
        System.out.println("This is a show1 method which is protected");
    }

    public final void show3(){
        System.out.println("This is a show3 method");
    }
}
