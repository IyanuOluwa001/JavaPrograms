package CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int age;
    int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
                    ", age=" + age +
                    ", mark=" + mark +
                    '}';
    }
}


public class CollectionDemo2 {
    public static void main(String[] args) {

        //Method One
        /*
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits);

        for(String f: fruits){
            System.out.println(f);
        }
        */

        //Method Two
        /*
        List<String> fruits = Arrays.asList("apple", "banana", "orange");

        System.out.println(fruits);

        for(String f: fruits){
            System.out.println(f);
        }
        */

        //Another Example
        //Type One
        /*
        Student s1 = new Student("John", 23, 72);
        Student s2 = new Student("Wale", 28, 69);
        Student s3 = new Student("Alex", 31, 82);

        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

        for(Student st: students){
            System.out.println(st);
        }
        */

        //Type Two
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 23, 72));
        students.add(new Student("Blessing", 18, 57));
        students.add(new Student("Alexander", 37, 60));
        students.add(new Student("Love", 25, 82));

        System.out.println(students);

        for(Student st: students){
            System.out.println(st);
        }

        /*
        List<Student> students = Arrays.asList(s1,s2,s3);
        */
    }

}


