package ObjectOrientedPackage;

public class ObjectOrientedDemo4 {
    String name;
    int age;
    int level;

    public ObjectOrientedDemo4(){
        System.out.println("helooooo no param constructor");
    }

    public ObjectOrientedDemo4(String myName, int age){
        this.name = myName;
        this.age = age;
        this.level = level;
    }
    public void show(){
        System.out.println("my name is "+this.name+" I am "+this.age);
    }
    public void show1(){
        System.out.println("my name is "+this.name+" I am in "+this.level+" level");
    }
}
