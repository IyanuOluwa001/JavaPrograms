package ObjectOrientedPackage;

public class WrapperDemo {
    public static void main(String[] args) {


        //Wrapper class
        int val = 12; //int, float, double
        Integer val1 = Integer.valueOf(val); //Boxing or wrapping (converting primitive type to a reference type)
        int val2 = val1.intValue(); // Unboxing or unwrapping (converting reference type to primitive type)

        int num = 15;
        Integer num1 = num; // Autoboxing or autowrapping
        int num3 = num1; // Autouboxing or autounwrapping

        //Note: Integer class is a wrapper class for primitive type int.
        //so also is
        //Float -> float
        //Double -> double
        //Byte -> byte
        //Boolean -> boolean
    }
}
