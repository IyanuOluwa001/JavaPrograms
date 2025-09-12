package ObjectOrientedPackage.ObjectOrientedFundamentals.EncapsulationPackage;

class Animal{

    private int id;
    private String name;
    private int age;
    private String location;

    public Animal(){
    }

    public Animal (int id, String name, int age, String location){
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

public int getId(){
        return id;
}

public void setId(int id){
        this.id = id;
}

public String getName(){
        return name;
}

public void setName(String name){
        this.name = name;
}

public int getAge(){
        return age;
}

public String getLocation(){
        return location;
}

public void setLocation(String location){
        this.location = location;
}

@Override
    public String toString() {
    return "Animal{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", location='" + location + '\'' +
            '}';
}

}

public class EncapsulationDemo2 {

    public static void main(String[] args) {

        Animal a1 = new Animal(1,"Pig", 10, "France");
        Animal a2 = new Animal(2, "Dog", 4,"US");

//a1.setName("Hen");

        System.out.println(a2.getName());
        //System.out.println(a2);
    }
}

