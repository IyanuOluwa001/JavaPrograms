package ObjectOrientedPackage;
class Reason {
    public void show(Number m) {
        System.out.println("This is a number method");
    }

    public void show(Integer n) {
        System.out.println("This is an integer method");
    }

    public void show(Double o) {
        System.out.println("This is a double method");
    }

}
public class AbstractReason {
    public static void main(String[] args) {
        Reason r = new Reason();
        r.show(6);
        Number num = 6.5f;
        System.out.println(num.getClass());
    }
}
