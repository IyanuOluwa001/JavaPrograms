package ObjectOrientedPackage;

//Inner Class: There are 3 types of inner class

//1. Member class
//2. Static class
//3. Anonymous class

class Erudite1{
    int x =10;

    public void my_outer(){
        System.out.println("This is an outer method");
    }

    class Inner{ //member class
        int y=15;

        public void my_inner(){
            System.out.println("This is an inner method");
        }
    }

    static class Inner1{ //static class
        int m=25;

        public void my_inner1() {
            System.out.println("This is an inner1 method in a static class");
        }
    }
}

public class InnerClassIntro {
    public static void main(String[] args) {
        Erudite1 myOuterObj = new Erudite1();
        //System.out.println(myOuterObj.x);

        //Note:We cannot create the object of inner class directly
        //Inner myInner = new Inner();

        Erudite1.Inner myInner = myOuterObj.new Inner();
        myInner.my_inner();

        Erudite1.Inner1 myInner1 = new Erudite1.Inner1();
        //myInner.my_Inner();
        myInner.my_inner();

    }
}
