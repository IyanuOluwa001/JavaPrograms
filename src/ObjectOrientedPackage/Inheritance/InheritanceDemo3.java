package ObjectOrientedPackage.Inheritance;

//Hierarchical inheritance (parent class has more than one child class)

class Vehicle1 {

    public void vehicleMethod1() {
        System.out.println("hello methhod1 in Vehicle1 class ");
    }
}

    class Car1 extends Vehicle1{

        public void car1Method(){
            System.out.println("Hello car1 method in car1 class ");
        }
    }

class Bus1 extends Vehicle1{

    public void bus11Method(){
        System.out.println("Hello bus1 method in car1 class ");
    }
}

    class Trailer extends Vehicle1{

    public void trailerMethod(){
        System.out.println("Hello trailer method in trailer class");
    }
        }


public class InheritanceDemo3 {
    public static void main(String[] args) {
        //Car1 c = new Car1();
        Bus1 b = new Bus1();
        Trailer t = new Trailer();

        //Vehicle1 v = new Car1();
    }
}
