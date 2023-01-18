public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }


    public String toString() {
        return "I hope I did everything right";
    }

    public void learn() {
        System.out.println("Learning ");
    }

    public void walk() {
        System.out.println("Walking ");
    }

    public void eat() {
        System.out.println("Eats ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
