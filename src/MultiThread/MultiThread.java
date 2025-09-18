package MultiThread;

class Demo1 extends Thread{
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("Helloo");
            //Thread.sleep(1000);
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}

class Demo2 extends Thread{
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("Hiiii");

            //Two ways to handle the exceptio
            //Thread.sleep(1000);
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {

        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();

        d1.start();
        try{Thread.sleep(100);}
        catch(Exception e){}
        d2.start();

        //d1.show();
        //d2.show();

        //Note: when you are calling a start method from the thread class, then it is a must to have
        // a run method inside the child class.
    }
}
