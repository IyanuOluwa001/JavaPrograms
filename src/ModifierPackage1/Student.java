package ModifierPackage1;

import ModifierPackage2.Demo1;

public class Student extends Demo1 {

    public void show(){
        //x =14;
        m=12;

        show2();
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
