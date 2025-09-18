package MultiThread;

class Demo5 implements Runnable{

    public void run() {
        for(int i=1; i<=25; i++){
            System.out.println("Hellooo");
            //Thread.sleep(1000);
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
        }
}

class Demo6 implements Runnable{

    public void run() {
        for(int i=1; i<=25; i++){
            System.out.println("Hiiiii");
            //Thread.sleep(1000);
            try{Thread.sleep(1000);}
            catch(Exception e){}
        }
    }
}

public class RunnableDemo2 {

    public static void main(String[] args) {
        //Demo5 d1 = new Demo5();
        //Demo6 d2 = new Demo6();

        Runnable d1 = new Runnable()

        {
                public void run() {
                    for (int i=1; i<=5; i++) {
                        System.out.println("Hellooo");
                        //Thread.sleep(1000);
                        try {Thread.sleep(1000);}
                        catch (Exception e) {}
                    }
                }
        };

        Runnable d2 = new Runnable()

        {
            public void run() {
                for (int i=1; i<=5; i++) {
                    System.out.println("Hiiii");

                    //Two ways to handle the exception
                    //Thread.sleep(1000);
                    try {Thread.sleep(1000);}
                    catch (Exception e) {}
                }
            }
        };

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        try{Thread.sleep(100);}
        catch(Exception e){}
        t2.start();

    }
}
