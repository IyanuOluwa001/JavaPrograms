package MultiThread;

class Track{
    int c;
    public synchronized void add(){
        c++;
        //System.out.println(c);
    }
}

public class RunnableWithLambda2 {
    public static void main(String[] args) throws InterruptedException {
        Track t = new Track();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=1; i<=100; i++) {
                    t.add();
                    try {Thread.sleep(50);}
                    catch (Exception e) {}
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=1; i<=100; i++) {
                    t.add();
                    try {Thread.sleep(50);}
                    catch (Exception e) {}
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t.c);

        //Note: When we use synchronized keyword with a method, multiple threads will not be
        //that method at the same time
    }
}
