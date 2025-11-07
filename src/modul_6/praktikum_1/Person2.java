package modul_6.praktikum_1;

public class Person2 {
    protected String name;
    protected int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void greet() {
        System.out.println("Hello, I am a person.");
    }
}
