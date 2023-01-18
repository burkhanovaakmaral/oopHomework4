
public class Singer extends Person {

    private String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    @Override
    public String toString(){
        return super.toString();
    }

    public void singing() {
        System.out.println("Singing");
    }

    public void playGuitar() {
        System.out.println("Play guitar");
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
