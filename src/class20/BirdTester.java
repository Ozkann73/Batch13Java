package class20;

public class BirdTester {
    public static void main(String[] args) {
        Parrot parrot = new Parrot ("parrot","Black",10,.5);
        parrot.printInfo();

        Sparrow sparrow = new Sparrow("Jack Sparrow","White",10,0.8);
        sparrow.printInfo();
    }
}
