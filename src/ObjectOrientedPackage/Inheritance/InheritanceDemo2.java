package ObjectOrientedPackage.Inheritance;

//Multilevel inheritance

class Vehicle{
    public void VehicleMethod(){
        System.out.println("heloo Method1 in vehicle class");
    }
}

class Car extends Vehicle{
    public void CarMethod(){
        System.out.println("hello, car method in car class");
    }
}

class Bus extends Car{
    public void busMethod(){
        System.out.println("Hello, bus method in Bus class");
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        //Vehicle obj = new Vehicle();
        //obj.method1();

        Car obj1 = new Car();
        obj1.CarMethod();

        Bus b = new Bus();
        b.CarMethod();
        b.busMethod();
    }
}
