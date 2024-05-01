import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }
       //Getter: Digunakan untuk mengambil nilai properti privat.
    //Setter: Digunakan untuk menetapkan nilai properti privat.
    // Setter dan getter
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Method untuk mendapatkan tunjangan tambahan
    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (super.getGaji() * 0.1);
    }

    // Method toString
    @Override
    public String toString() {
        return super.toString() + "\ndepartemen : " + departemen;
    }
}
