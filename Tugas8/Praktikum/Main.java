public class Main {
    public static void main(String[] args) {
        // Data Pegawai Tetap
        Pegawai[] pegawaiTetap = {
            new PegawaiTetap("Jati", "1111111", 1111111),
            new PegawaiTetap("Yuana", "222222", 2222222),
            new PegawaiTetap("marta", "333333", 333333)
        };

        // Data Pegawai Harian
        Pegawai[] pegawaiHarian = {
            new PegawaiHarian("Wibawa", "44444", 3333333, 40),
            new PegawaiHarian("al", "55555", 700033330, 45),
            new PegawaiHarian("afika", "6666666", 333333, 38)
        };

        // Data Sales
        Pegawai[] sales = {
            new Sales("Mera", "7777777", 33333, 50232300.0),
            new Sales("Ilham", "88888", 33333, 3232.0),
            new Sales("lisa", "99999", 333333, 32322.0)
        };

        // Cetak Data Pegawai
        cetakData("Data Pegawai Tetap", pegawaiTetap);
        cetakData("Data Pegawai Harian", pegawaiHarian);
        cetakData("Data Sales", sales);
    }

    // Metode untuk mencetak data pegawai berdasarkan tipe
    public static void cetakData(String label, Pegawai[] pegawaiArray) {
        System.out.println("\n" + label + ":");
        System.out.println("===================");
        for (Pegawai p : pegawaiArray) {
            System.out.println(p + "\n");
        }
    }
}
