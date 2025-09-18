package ObjectOrientedPackage.InterfaceDemo;

interface DemoInterface{

}

class Marker implements DemoInterface{
    void show(){
        System.out.println("This is a show method in marker class");
    }
}
public class MarkerInterface {
    public static void main(String[] args) {
        Marker m = new Marker();
        if (m instanceof DemoInterface){
            m.show();
        }
        else{
            System.out.println("permission denied");
        }
    }
}
