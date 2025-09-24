package MultiThread;

public class RunnableWithThread {

        public static void main(String[] args) {

        /*
        //How to define lambda expression
        Runnable d1 =()->
        {
            for (int i=1; i<=5; i++) {
                System.out.println("Hellooo");
                //Thread.sleep(1000);
                try {Thread.sleep(1000);}
                catch (Exception e) {}
            }
        };

        Runnable d2 =()->
        {
            for (int i=1; i<=5; i++) {
                System.out.println("Hiiii");
                try {Thread.sleep(1000);}
                catch (Exception e) {}
            }
        };
         */

            //OR


            Thread t1 = new Thread(()->
            {
                for (int i = 1; i <= 5;i++){
                    System.out.println("Hellooo");
                    try {Thread.sleep(1000);}
                    catch (Exception e) {}
                }
            });

            Thread t2 = new Thread(()->
            {
                for (int i = 1; i <= 5;i++){
                    System.out.println("Hiiiiii");
                    try {Thread.sleep(1000);}
                    catch (Exception e) {}
                }
            });





            //If we use the Thread part of this code, we would need to comment thread t1 and t2 For example like here.
            //Thread t1 = new Thread(d1);
            //Thread t2 = new Thread(d2);

            t1.start();
            try {Thread.sleep(100);}
            catch (Exception e){}
            t2.start();
        }



}
