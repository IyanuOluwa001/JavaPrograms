package ObjectOrientedPackage;

abstract class Writer{
    public abstract void show();
}

class Pen extends Writer{
    public void show(){
        System.out.println("This is a pen");
    }
}

class Pencil extends Writer{
    public void show(){
        System.out.println("This is a pencil");
    }
}


public class AbstractExample {
}
