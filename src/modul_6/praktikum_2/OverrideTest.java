package modul_6.praktikum_2;

public class OverrideTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("GenericMotor", 120);
        v.info();
        v.startEngine();

        System.out.println("---");

        Car c = new Car("Lamborghini", 180, 5);
        c.info();         // overridden method
        c.startEngine();  // overridden method

        System.out.println("--- Polymorphism ---");
        Vehicle poly = new Car("Porshe", 200, 4);
        poly.info();      // calls Car.info() because of overriding
        poly.startEngine(); // calls Car.startEngine()
    }
}
