package ObjectOrientedPackage.Inheritance;

//We cannot inherit more than one class in java because we want to avoid code ambiguity.
//This means to achieve multiple inheritance in jaa, we need an interface.

class Inverter1{
    public void show(){
        System.out.println("helooo inverter1");
    }
}

class Inverter2{
    public void show(){
        System.out.println("helooo inverter 2");
    }
}

class Inverter3 extends Inverter1 {

    //public void show(){
    //  System.out.println("Hello Inverter3");
    //}
}

public class MultipleInheritanceNotAllowed {
    public static void main(String[] args) {
        //Inverter1 obj1 = new Inverter1();
        Inverter3 ivt = new Inverter3();
        ivt.show();
    }
}
