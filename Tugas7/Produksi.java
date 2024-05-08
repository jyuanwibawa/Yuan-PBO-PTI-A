import java.time.LocalDate;

public class Produksi extends Employee {
    private double upahPerBarang;
    private double jumlahBarang;

    public Produksi(String name, String noKTP, LocalDate tanggalLahir, double upahPerBarang, double jumlahBarang) {
        super(name, noKTP, tanggalLahir);
        setProductionDetails(upahPerBarang, jumlahBarang);
    }

    public void setProductionDetails(double upahPerBarang, double jumlahBarang) {
        this.upahPerBarang = upahPerBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public double getJumlahBarang() {
        return jumlahBarang;
    }

    public double earnings() {
        return upahPerBarang * jumlahBarang;
    }

    public String toString() {
        return String.format("Production employee: " + super.toString() + "\nUpah per barang: " + upahPerBarang + "\nJumlah barang: " + jumlahBarang);
    }
}
