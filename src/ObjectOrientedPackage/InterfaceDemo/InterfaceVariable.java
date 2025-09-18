package ObjectOrientedPackage.InterfaceDemo;

interface Desk{
    //Note: Any variable inside an interface is public, static and final by default.
    public static final int x=5;
    int y=45;
}

class Desk1 implements Desk{
    int m =32;
    int b;
}

public class InterfaceVariable {
    public static void main(String[] args) {
        Desk1 d = new Desk1();
        d.m = 34;
        System.out.println(Desk.x);
    }
}
