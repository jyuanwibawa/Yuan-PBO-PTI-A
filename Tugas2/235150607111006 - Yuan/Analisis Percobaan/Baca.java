public class Baca {
    private int halaman;
    private int kata;

    public Baca(int halaman, int kata) {
        this.halaman = halaman;
        this.kata = kata;
    }

    public int getHalaman() {
        return halaman;
    }

    public int getKata() {
        return kata;
    }

    public double hitungWaktuMenulis() {
      
        double halamanPerHari = (double) kata / 200;

        double jumlahHari = (double) halaman / (halamanPerHari * 2);

        return jumlahHari;
    }
}