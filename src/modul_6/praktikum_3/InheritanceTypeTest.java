package modul_6.praktikum_3;

public class InheritanceTypeTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Arfan");
        dog.eat();     // inherited Animal method
        dog.sound();   // overridden in Dog
        dog.fetch();
        dog.nurseYoung(); // Mammal method

        System.out.println("---");

        Cat cat = new Cat("Mittens");
        cat.eat();
        cat.sound();
        cat.scratch();
        cat.nurseYoung();

        System.out.println("--- Polymorphism ---");
        Animal a1 = new Dog("Rex");
        Animal a2 = new Cat("Luna");

        a1.sound(); // runtime binding -> Dog.sound()
        a2.sound(); // Cat.sound()
    }
}
