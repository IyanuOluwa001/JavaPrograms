package MultiThread;

//Working with runnable interface

class SoftCode{
    public void Hello(){
        System.out.println("Hello Method");
    }
}

class Demo3 extends SoftCode implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println("Hello");
            //Thread.sleep(1000);
            try{Thread.sleep(1000);}
            catch (Exception e){}
        }
    }
}

class Demo4 implements Runnable{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("Hiiii");

            //two ways to handle the exception
            //Thread.sleep(1000);
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}

public class RunnableDemo1 {
    public static void main(String[] args) {
        //Demo3 d1 = new Demo3();
        //Demo3 d2 = new Demo3();

        Runnable d1 = new Demo3();
        Runnable d2 = new Demo4();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        try {Thread.sleep(100);}
        catch (Exception e){}
        t2.start();
    }
}
