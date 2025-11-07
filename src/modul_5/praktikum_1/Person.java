package modul_6.praktikum_1;

public class Person {
    //Private - hanya bisa diakses dalam class ini
    private String nama;
    private int umur;

    //Default (package-private) - bisa diakses dalam package yang sama
    String alamat;

    //Protected - bisa diakses dalam package dan subclass
    protected String telepon;

    //Public - bisa diakses dari mana saja
    public String email;

    //Constructor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Public method untuk menampilkan info
    public void tampilkanInfo() {
         System.out.println("INFORMASI PERSON");
         System.out.println("Nama   : " + nama);
         System.out.println("Umur   : " + umur);
         System.out.println("Alamat : " + alamat);
         System.out.println("Telepon: " + telepon);
         System.out.println("Email  : " + email);
    }

    //Private method - hanya bisa dipanggil dalam class ini
    private void metodePribadi() {
        System.out.println("Ini adalah method private");
    }

    //Protected method
    protected void metodeProtected() {
        System.out.println("Ini adalah method protected");
    }

    //Method untuk mengakses private method
    public void panggilMetodePribadi() {
        metodePribadi(); // OK - dalam class yang sama
    }
}