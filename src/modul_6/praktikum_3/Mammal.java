package modul_6.praktikum_3;

public class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal() {
        super();
        this.hasFur = true;
        System.out.println("A mammal is created.");
    }

    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
        System.out.println("Mammal created: " + name + ", hasFur=" + hasFur);
    }

    public void nurseYoung() {
        System.out.println(name + " is nursing its young.");
    }
}
