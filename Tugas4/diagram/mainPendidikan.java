package Tugas4.diagram;

public class mainPendidikan {
    public static void main(String[] args) {
        // Membuat objek Pendidikan menggunakan constructor overloading
        Pendidikan pendidikan1 = new Pendidikan();
        Pendidikan pendidikan2 = new Pendidikan("SMA Negeri 1 Jakarta");
        Pendidikan pendidikan3 = new Pendidikan("SMA Negeri 2 Surabaya", "SMA", "Surabaya");

        // Memanggil method overloading dari objek pendidikan1
        pendidikan1.informasi_sekolah();
        pendidikan1.informasi_sekolah("SMA Negeri 3 Bandung");
        pendidikan1.informasi_sekolah("SMA Negeri 4 Yogyakarta", "SMA", "Yogyakarta");

        // Memanggil method instance yang mengembalikan tipe data class itu sendiri
        Pendidikan instancePendidikan = pendidikan1.getPendidikanInstance();
        System.out.println("Instance Pendidikan: " + instancePendidikan);
    }
}
