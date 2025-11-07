package modul_6.praktikum_3;

public class Cat extends Mammal {
    public Cat() {
        super();
        this.name = "Cat";
        System.out.println("A Cat is created.");
    }

    public Cat(String name) {
        super(name, true);
        System.out.println("Cat created: " + name);
    }

    @Override
    public void sound() {
        System.out.println(name + " meows: Meow~");
    }

    public void scratch() {
        System.out.println(name + " is scratching.");
    }
}
