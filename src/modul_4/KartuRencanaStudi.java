package modul_4;

public class KartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private Matakuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;

    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new Matakuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    // Menambah mata kuliah ke KRS
    public boolean tambahMataKuliah(Matakuliah matkul) {
        if (jumlahMatkul < maxMatkul) {
            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("✔ Note: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
            return true;
        } else {
            System.out.println("⚠ Note: KRS sudah penuh! Maksimal = " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    // Menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS;
    }

    // Menghitung IPK
    public double hitungIPK() {
        int totalSKS = 0;
        double totalBobot = 0.0;

        for (int i = 0; i < jumlahMatkul; i++) {
            Matakuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }

        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    // Menampilkan KRS
    public void tampilkanKRS() {
        System.out.println("------------------------------------------------------");
        System.out.println("              KARTU RENCANA STUDI (KRS)               ");
        System.out.println("------------------------------------------------------");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NIM            : " + mahasiswa.getNim());
        System.out.println("Program Studi  : " + mahasiswa.getJurusan());
        System.out.println("------------------------------------------------------");
        System.out.println("KODE     MATA KULIAH                     SKS  NILAI");
        System.out.println("------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("⚠ Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Total SKS       : " + hitungTotalSKS());
        System.out.printf ("IPK Semester    : %.2f\n", hitungIPK());
        System.out.println("------------------------------------------------------");
    }

    // Mencari mata kuliah berdasarkan kode
    public Matakuliah cariMataKuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }
}

