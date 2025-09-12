package ObjectOrientedPackage;

class Student{
    String studentName;
    int studentAge;

    //Introduction to "this" keyword. It inherits the object e.g s1 or s2 or s2 in this example
    public Student(){
        this.studentName = "david"; //s1.studentName=David
        this.studentAge = 23; //s1.studentAge=23
    }

    public void studentInfo(){
        System.out.println("you are welcome " + this.studentName + " you are " + this.studentAge +" years old");
    }

    public void info(){
        System.out.println("you are welcome "+ studentName + " you are " + studentAge+" years old again");
    }
// static block: this is a block of code that will be executed immediately the class is being initiated.
}
public class ObjectOrientedDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentName = "paul";
        s1.studentAge = 27;

        //s2.studentName="patrick"
        //s2.studentAge=27;

        //s1.studentInfo();
        //s2.studentInfo();

        s1.info();
        s2.info();
        s3.studentInfo();
    }

    ObjectOrientedDemo4 obj = new ObjectOrientedDemo4();
    //ObjectOrientedDemo4 obj1 = new ObjectOrientedDemo4("John", 21);
    //ObjectOrientedDemo4 obj2 = new ObjectOrientedDemo4("Paul", 25, 200);
    //ObjectOrientedDemo4 obj3 = new ObjectOrientedDemo4("Peter", 27, 400);

    //obj2.show1();
    //obj3.show2();

}
