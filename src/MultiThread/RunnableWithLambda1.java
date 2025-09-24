package MultiThread;

public class RunnableWithLambda1 {

    public static void main(String[] args) throws InterruptedException{

            Thread t1 = new Thread(()->
         {
            for (int i = 1; i <= 5;i++){
                    System.out.println("Hellooo");
                try {Thread.sleep(1000);}
                catch (Exception e) {}
            }
         }, "My first Thread class");


        Thread t2 = new Thread(()->
        {
            for (int i = 1; i <= 5;i++){
                System.out.println("Any airdrop yet?");
                try {Thread.sleep(1000);}
                catch (Exception e) {}
            }
        });


        t1.start();
        try {Thread.sleep(100);}
        catch (Exception e){}
        t2.start();

        //isAlive helps us to check if a thread is still in operation
        //System.out.println(t1.isAlive());

        //Note: Join method allow main thread to hold on till the two threads complete their executions
        t1.join();
        t2.join();

        System.out.println("Goodbye thread");
        //System.out.println(t1.isAlive());


        //To set the name of thread, we can do it in 2ways
        //1.
        //t1.setName("My First Thread");

        //To check the name of thread
        //2.
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}

