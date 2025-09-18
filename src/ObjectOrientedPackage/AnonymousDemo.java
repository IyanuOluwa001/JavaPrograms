package ObjectOrientedPackage;

class Test1{

    public void show(){
        System.out.println("This is a show method in Test1 class");
    }

    public void show1(){
        System.out.println("This is a show1 method in Test1 class");
    }
}

/*class Test2 extends Test1{
    public void show(){
        System.out.println("This is a show method in Test2 class");
    }
}

 */

public class AnonymousDemo {
    public static void main(String[] a) {
        //Test2 t = new Test2();
        //Test1 t = new Test1();
        //t.show();

        /*
        Test1 t = new Test1()

        {
            public void show() {
                System.out.println("This is a show method in anonymous class");
            }
        };
        */
        //t.show()

//If there is a method in anonymous class but not in the original class, then we will not be able to call that method

        Test1 t = new Test1()

        {
            public void show() {
            System.out.println("This is a show method in Anonymous class");
            }


            public void show1() {
            System.out.println("This is a show1 method in Anonymous class");
            }

            public void show2 () {
            System.out.println("This is a show1 method in Anonymous class");
            }
        };

        Test1 t1 = new Test1()
        {
            public void show(){
                System.out.println("this is a show method in second Anonymous class");
            }
        };


        //
        t1.show();
        t.show();
    }
}
