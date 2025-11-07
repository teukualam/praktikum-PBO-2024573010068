package modul_6.praktikum_1;

public class AccessModifierTest {
    public static void main(String[] args) {
        Person person = new Person("Teuku Alam Faziansyah", 19);

        // Test akses public
        person.email = "teukualamfaziansyah@email.com";   // OK - public
        System.out.println("Email: " + person.email);

        // Test akses default (dalam package yang sama)
        person.alamat = "Aceh";         // OK - dalam package yang sama
        System.out.println("Alamat: " + person.alamat);

        // Test akses protected (dalam package yang sama)
        person.telepon = "081390463237";   // OK - dalam package yang sama
        System.out.println("Telepon: " + person.telepon);

        // Test akses private - AKAN ERROR jika uncomment
        // person.nama = "Teuku Alam Faziansyah";            // ERROR - private
        // person.umur = 18;                // ERROR - private
        // person.metodePribadi();          // ERROR - private

        // Mengakses data private melalui public method
        person.tampilkanInfo();

        // Mengakses private method melalui public method
        person.panggilMetodePribadi();

        System.out.println("\nDEMONSTRASI ACCESS MODIFIER");
        System.out.println("✓ Public   : Bisa diakses");
        System.out.println("✓ Default  : Bisa diakses (dalam package sama)");
        System.out.println("✓ Protected: Bisa diakses (dalam package sama)");
        System.out.println("✗ Private  : TIDAK bisa diakses langsung");
    }
}

