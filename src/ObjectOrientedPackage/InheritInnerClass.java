package ObjectOrientedPackage;

class Medical{

    public void method1(){
        System.out.println("Hello method1");
    }

    class Nurse{

        public void my_nurse(){
            System.out.println("Hello nurse method");
        }
    }

    static class Ward{

        public void my_ward(){
            System.out.println("Hello ward method");
        }
    }

    static class Appointment extends Ward{

        public void my_doctor(){
            System.out.println("Hello doctor method");
        }

        static void admin(){
            System.out.println("This is an admin method");
        }
    }
}

class Reception extends Medical.Appointment{

}

public class InheritInnerClass {
    public static void main(String[] args) {
        /*
        Medical md = new Medical();
        Medical.Nurse obj = md.new Nurse();
        obj.my_nurse();
        */

        //Medical.Appointment.admin();

        Medical.Appointment apt = new Medical.Appointment();
        apt.my_doctor();
        //apt.my_ward();

        /*
        Reception rc = new Reception();
        rc.my_doctor();
         */
    }
}
