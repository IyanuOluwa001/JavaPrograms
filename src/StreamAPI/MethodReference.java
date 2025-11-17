package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {
        //Method 1: Method reference, used when we don't want to use lambda expression
        /*
        List<String> names = Arrays.asList("peace","james","peter");
        names.forEach(n-> System.out.println(n));
        */


        //Method 2: Method reference, used when we don't want to use lambda expression
        /*
        List<String> names = Arrays.asList("peace","james","peter");
        names.forEach(System.out::println);
        */

        //Method 3
        /*
        List<Student> students = Arrays.asList(
               new Student("alex"),
               new Student("jamesbond"),
               new Student("alexander")
       );

       students.forEach(b-> System.out.println(b));
       */

        //Method 3-2
        /*
        List<Student> students = Arrays.asList(
               new Student("alex"),
               new Student("jamesbond"),
               new Student("patrick")
       );

       students.forEach(System.out::println);
       */

        //Method 4
        /*
        List<String> names = Arrays.asList("peace","james","peter");

        List<Student> students = names.stream()
                .map(name-> new Student(name))
                .collect(Collectors.toList());

        students.forEach(s-> System.out.println(s));
        */

        //Method 5
        List<String> names = Arrays.asList("peace","james","peter");

        List<Student> students = names.stream()
                .map(Student::new) //Create object of each element in names
                .collect(Collectors.toList());

        students.forEach(System.out::println);
    }
}
