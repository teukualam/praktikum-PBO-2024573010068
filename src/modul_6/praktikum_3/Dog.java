package modul_6.praktikum_3;

public class Dog extends Mammal {
    public Dog() {
        super();
        this.name = "Dog";
        System.out.println("A Dog is created.");
    }

    public Dog(String name) {
        super(name, true);
        System.out.println("Dog created: " + name);
    }

    @Override
    public void sound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching a ball.");
    }
}
