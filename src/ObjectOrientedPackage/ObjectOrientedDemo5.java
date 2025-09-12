package ObjectOrientedPackage;

class School{
    String name;
    String location;

    public School(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String schoolInfo(){
        return ("my school name is "+this.name+" and it is located in "+this.location);
    }
}


class Candidate{
    String name;
    int age;
    School mySchool;

    public Candidate (String name, int age, School mySchool){
        this.name = name;
        this.age = age;
        this.mySchool = mySchool;
    }

    public void candidateInfo(){
        System.out.println("my name is "+this.name+" I am "+this.age+this.mySchool.schoolInfo());
    }
}

public class ObjectOrientedDemo5{
    public static void main(String[] web3pips) {
        School school1 = new School ("Unilag", "Lagos");
        //System.out.println(school1.schoolInfo());
        School school2 = new School ("Oxford", "England");
        Candidate candidate = new Candidate ("Davod", 21, school1);
        candidate.candidateInfo();
    }
}