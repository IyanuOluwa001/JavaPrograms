package ObjectOrientedPackage.ObjectOrientedFundamentals.EncapsulationPackage;

class Tech{
    private int id;
    private String name;

    public Tech() {
    }

    public Tech(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EncapsulationGenerate {
    public static void main(String[] args) {

        Tech t1 = new Tech (1, "Java");
        Tech t2 = new Tech (2, "Python");

        //System.out.println(t1.getName());
        System.out.println(t1);
        System.out.println(t2);
    }
}
