import java.time.LocalDate;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    //Getter: Digunakan untuk mengambil nilai properti privat.
    //Setter: Digunakan untuk menetapkan nilai properti privat.
    // Setter dan getter
    public String getNama() {
        return nama;    
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // Method untuk menghitung tunjangan
    // laki2 mendapatkan 25 dolar, cewe dapat  20 dolar
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;//tidak nikah
        }
    }

    // Method untuk menghitung pendapatan
    public double getPendapatan() {
        return getTunjangan();
    }

    // Method toString
    @Override
    public String toString() {
        return "nama : " + nama + "\nnik : " + nik + "\njenisKelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\npendapatan : " + getPendapatan();
    }
}
