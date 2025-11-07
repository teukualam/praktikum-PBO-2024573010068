package modul_6.praktikum_3;

public class Animal {
    protected String name;

    public Animal() {
        this.name = "Unnamed";
        System.out.println("An animal is created.");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal created: " + name);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}
