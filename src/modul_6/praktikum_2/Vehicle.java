package modul_6.praktikum_2;

public class Vehicle {
    protected String brand;
    protected int topSpeed;

    public Vehicle() {
        this.brand = "Generic";
        this.topSpeed = 0;
        System.out.println("This is a Vehicle (default)");
    }

    public Vehicle(String brand, int topSpeed) {
        this.brand = brand;
        this.topSpeed = topSpeed;
        System.out.println("This is a Vehicle: " + brand);
    }

    public void info() {
        System.out.println("Brand: " + brand + ", Top Speed: " + topSpeed + " km/h");
    }

    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}
