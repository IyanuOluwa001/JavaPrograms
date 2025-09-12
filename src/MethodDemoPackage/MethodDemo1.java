package MethodDemoPackage;

public class MethodDemo1 {
    //DEFINITION OF A METHOD
        /*
        METHOD: A method is a block of code that you need to call before the block of code within it can be executed

        A.  Classification Based on Parameter
            1. Parameterized method

            2. Non-parameterized method
                This method is also a static method

        B.  Classification Based on instance of the class
            1. Static or Class method
            Anyone that has static keyword is a static method
            Static is a method you can call directly and we can call it through the class itself

            2. Instance or Non-static method
     */

    static void myMethod1(){
        System.out.println("Welcome to my methods class");
    }

    static int myMethod2(){
        return 45;
    }

    static String myMethod3(){
        return "heloo string method";
    }

    static String myMethod4(){
        String info = "heloo brother method😍";
        return info;
        //This method is static, we can call the class directly. But it is also not-void, so we have to return string
        //so we define string in line 35 before return (or printing)
    }

    //CLASS ASSESSMENT: Create a method that returns double
    static double myMethod5(){
        return 89.4703;
    }

    public static void main(String[] args) {
        MethodDemo1 obj = new MethodDemo1(); //This is us creating the class obj using - ClassName variable(OR)object = new ClassName
        obj.IyanuMethod(); //this is how to call object of a non static class obj (which is an instance of IyanuMethod
        System.out.println(obj.anotherMethod()); //because we returned something here

        //But if we call the class itself i.e MethodDemo1, it will bring all the method that belongs to the class or all the Class Method (which are also Static methods)
        //
    /*
    1. Non-parameterized method which are static
        Note: When we use void, it means the method will not return anything or we cannot use return keyword in
        Note: When we use public, it means that we want to be able to use that method in other package other than the package we created it inside.
        Note: We can't create/define a new method inside our normal main psvm method. We can define/create it above or below it.
        Note: We can call the method we define outside our main method inside our main method
        Note: You can call static method inside our main method DIRECTLY, because our main method is also static
    */

        //Calling a static method inside a static method - DIRECTLY
        myMethod1();
        //Calling a static method using the class name
        MethodDemo1.myMethod1();
        //Calling a static method that is not void, meaning we are returning something (int,string,double, float etc) require that we use sout.
        System.out.println(myMethod2());
        System.out.println(myMethod3());
        System.out.println(myMethod4());
        System.out.println(myMethod5());
    }

    public void IyanuMethod(){
        System.out.println("this method belongs to Iyanu");
        //Because this is void and non-static, it means we are not returning anything and it is an instance method/non-static method
        //so we have to create the object of the class, we can't call it directly
    }

    public float anotherMethod(){
        float num = 23.32f;
        return num;
    }

}
