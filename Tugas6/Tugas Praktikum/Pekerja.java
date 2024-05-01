import java.time.LocalDate;
// kelas manusia mewariskan sifatnya ke pekerja
public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, 1, 1);
        this.jumlahAnak = jumlahAnak;
    }

    //Getter: Digunakan untuk mengambil nilai properti privat.
    //Setter: Digunakan untuk menetapkan nilai properti privat.
    // Setter dan getter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Method untuk mendapatkan bonus
    public double getBonus() {
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja <= 5) {
            return gaji * 0.05;
        } else if (lamaBekerja <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    // Method toString
    @Override
    public String toString() {
        return super.toString() + "\ntahun masuk : " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\njumlah anak : " + jumlahAnak + "\ngaji : " + gaji;
    }
}
