package ObjectOrientedPackage.ObjectOrientedFundamentals.EncapsulationPackage;

    /*
    Fundamentals of OOP
    1. Encapsulation
    2. Inheritance
    3. Polymorphism
    4. Abstraction
     */
    //Encapsulation (data binding) -> setter and getter or accessor and mutator

    class Erudite {
        //private int id;
        //private String name;
        private int age;
        String name;
        //int age;


        /* public int getId(){
             return id;
         }

         public void setId(int id){
             this.id = id;
         }*/
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    public class EncapsulationDemo1 {
        public static void main(String[] args) {
            Erudite e1 = new Erudite();
            Erudite e2 = new Erudite();
            Erudite e3 = new Erudite();

            //e1.name = "walex";
            //e2.name = "lara";

            e1.setName("patrick");

            System.out.println(e1.name);
            //System.out.println(e1.getName());

            // e2.setName("King");
            e3.setName("alex");
            //System.out.println(e2.getName());
            System.out.println(e3.getName());
        }
    }

