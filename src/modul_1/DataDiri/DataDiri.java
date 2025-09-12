package modul_1.DataDiri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDiri {
    public static void main(String[]args){
        String nama = "Teuku Alam Faziansyah";
        String nim = "2024573010068";
        LocalDate tanggalLahir = LocalDate.of(2006, 6,24);
        String alamat = "Tanah Pasir, Aceh Utara";
        String jurusan = "Teknologi Informasi dan Komputer";
        String prodi = "Teknik Informatika";
        int semester = 3 ;
        String kelas = "TI 2A";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println("Nama          : " + nama );
        System.out.println("Nim           : " + nim );
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(formatter));
        System.out.println("Alamat        : " + alamat );
        System.out.println("Jurusan       : " + jurusan );
        System.out.println("Prodi         : " + prodi );
        System.out.println("Semester      : " + semester );
        System.out.println("Kelas         : " + kelas );
    }
}