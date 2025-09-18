package ObjectOrientedPackage.InterfaceDemo;

//1. Normal Interface: this is the type that has more than one abstract method
//2. Single Abstract method(sam) or functional interface: this is the type that has only one abstract method
//3. Marker interface: this is the type that has no abstract method. (example is serializable)

class Status{
    public void showStat(){
        System.out.println(" in status class method");
    }
}

interface MyWriter{
    int c = 6;

    void show();

    void show1();
}

@FunctionalInterface
interface MyWriterNew{

    void NewShow();

    //void show(); //if we uncomment this, it will make the functionalinterface disapear because it is no longer following
    //the definition of functional interface
}


class Tesla implements MyWriter{
    @Override
    public void show(){
        System.out.println();
    }
    @Override
    public void show1(){
        System.out.println();
    }
}

class MyPen extends Status implements MyWriter{
    public void show(){
        System.out.println("This is a pen");
    }

    @Override
    public void show1(){
    }
}

class MyPencil implements MyWriter, MyWriterNew{
    public void show() {
        System.out.println("This is a pencil");
    }

    @Override
    public void show1() {
    }

    public void NewShow() {
        System.out.println("This is a pencil in NewShow method");
    }
}

interface NewInterface extends MyWriter {

}


class MyKit {
    public void display(MyWriter w) {
        w.show();
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        //MyWriter mpen = new MyWriter();
        //MyWriter mpen = new MyPen();
        //MyPen mpen = new MyPen();
        //MyWriter mpen = new MyWriter();
        //mpen.show();
    }
}
