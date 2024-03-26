package Tugas4.diagram;

public class Pendidikan {
    private String nama_sekolah;
    private String tingkat_Pendidikan;
    private String lokasi;

    // Constructor overloading
    public Pendidikan() {
        this.nama_sekolah = "Nama Sekolah Default";
        this.tingkat_Pendidikan = "Tingkat Pendidikan Default";
        this.lokasi = "Lokasi Default";
    }

    public Pendidikan(String nama_sekolah) {
        this.nama_sekolah = nama_sekolah;
        this.tingkat_Pendidikan = "Tingkat Pendidikan Default";
        this.lokasi = "Lokasi Default";
    }

    public Pendidikan(String nama_sekolah, String tingkat_Pendidikan, String lokasi) {
        this.nama_sekolah = nama_sekolah;
        this.tingkat_Pendidikan = tingkat_Pendidikan;
        this.lokasi = lokasi;
    }

    // Method overloading
    public void informasi_sekolah() {
        System.out.println("Informasi Sekolah:");
        System.out.println("Nama Sekolah: " + nama_sekolah);
        System.out.println("Tingkat Pendidikan: " + tingkat_Pendidikan);
        System.out.println("Lokasi: " + lokasi);
    }

    public void informasi_sekolah(String nama_sekolah) {
        System.out.println("Informasi Sekolah:");
        System.out.println("Nama Sekolah: " + nama_sekolah);
        System.out.println("Tingkat Pendidikan: " + tingkat_Pendidikan);
        System.out.println("Lokasi: " + lokasi);
    }

    public void informasi_sekolah(String nama_sekolah, String tingkat_Pendidikan, String lokasi) {
        System.out.println("Informasi Sekolah:");
        System.out.println("Nama Sekolah: " + nama_sekolah);
        System.out.println("Tingkat Pendidikan: " + tingkat_Pendidikan);
        System.out.println("Lokasi: " + lokasi);
    }

    // Method instance yang mengembalikan tipe data class itu sendiri
    public Pendidikan getPendidikanInstance() {
        return this;
    }
}
