package class12;

public class Phone {
    String model;
    String make;
    double screenSize;
    int RAM;

    int storage;
    int camera;

    void call() {
        System.out.println("Calling someone");
    }

    void takePicture() {
        System.out.println("Use my camera app to take pictures");
    }

    public static void main(String[] args) {
        Phone s22Ultra = new Phone();
        s22Ultra.make = "Samsung";
        s22Ultra.model = "s22Ultra";
        s22Ultra.screenSize = 6.8;
        s22Ultra.RAM = 12;
        s22Ultra.camera=108;
        s22Ultra.storage = 512;
        s22Ultra.call();
        s22Ultra.takePicture();

    }
}
