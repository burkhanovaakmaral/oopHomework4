public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Anna", "Developer", "Peaksoft");
        System.out.println("Name: " + programmer.getName() + "\nDesignation: " + programmer.getDesignation() + "\nCompany name: " + programmer.getCompanyName());
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();
        System.out.println(programmer.toString());
        System.out.println();

        Dancer dancer = new Dancer("Aya", "Dancer", "Sunflower");
        System.out.println("Name: " + dancer.getName() + "\nDesignation: " + dancer.getDesignation() + "\nGroup name: " + dancer.getGroupName());
        dancer.dancing();
        dancer.learn();
        dancer.eat();
        dancer.walk();
        System.out.println(programmer.toString());
        System.out.println();

        Singer singer = new Singer("Ben", "Singer", "Bubble");
        System.out.println("Name: " + singer.getName() + "\nDesignation: " + singer.getDesignation() + "\nBand name: " + singer.getBandName());
        singer.singing();
        singer.playGuitar();
        singer.learn();
        singer.eat();
        singer.walk();
        System.out.println(singer.toString());
    }
}