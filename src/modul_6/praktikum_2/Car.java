package modul_6.praktikum_2;

public class Car extends Vehicle {
    private int seats;

    public Car() {
        super();
        this.seats = 4;
        System.out.println("This Vehicle is Car (default)");
    }

    public Car(String brand, int topSpeed, int seats) {
        super(brand, topSpeed);
        this.seats = seats;
        System.out.println("This Vehicle is Car: " + brand);
    }

    // override info
    @Override
    public void info() {
        super.info(); // call Vehicle.info()
        System.out.println("Seats: " + seats);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine (brand: " + brand + ") roars to life!");
    }

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
}
