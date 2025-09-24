package CollectionAPI;

import java.util.Arrays;
import java.util.List;

public class CollectionDemo4 {
    //Define some methods that will accept list of different type of as an argument.
    //Define some methods that will return list of different type.

    public static List<String> langs(){
        List<String> stacks = Arrays.asList("JAVA", "Python", "Kotlin");
        return stacks;
    }

    public static void fruits(List<String> str){
        for(String val:str){
            System.out.println(val);
        }
    }

    public static List<String> myFruits(List<String> str){
        return str;
    }

    public static List<Student> students(){
        List<Student> all_students = Arrays.asList(new Student( "John", 23, 72),
                                                    new Student( "John", 23, 72),
                                                    new Student( "John", 23, 72));
        return all_students;
    }

    public static void main(String[] args) {
        //System.out.println(langs());

        List<String> all_fruits = Arrays.asList("Apple", "Orange", "Banana");

        //fruits(all_fruits);

        //System.out.println(students());
        //System.out.println(myFruits(all_fruits));

    }
}
