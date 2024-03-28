public class Pelanggan {
    private final String nomorPelanggan;
    private final String nama;
    private double saldo;
    private int percobaanAutentikasi;

    public Pelanggan(String nomorPelanggan, String nama, double saldo) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.percobaanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autentikasi(int pin) {
        // Logika autentikasi sederhana, selalu kembalikan true untuk demonstrasi
        return true;
    }

    public boolean diblokir() {
        return percobaanAutentikasi >= 3;
    }

    public void catatPercobaanGagal() {
        percobaanAutentikasi++;
    }

    public void topUp(double jumlah) {
        if (autentikasi(1234)) {
            saldo += jumlah;
        } else {
            catatPercobaanGagal();
        }
    }

    public boolean pembelian(double jumlah) {
        if (autentikasi(1234) && saldo - jumlah >= 10000) {
            double cashback = 0;
            if ( nomorPelanggan.startsWith("38")) {
                cashback = jumlah * 0.05;
            } else if (nomorPelanggan.startsWith("56")) {
                cashback = (jumlah > 1000000) ? jumlah * 0.07 : jumlah * 0.02;
            } else if (nomorPelanggan.startsWith("74")) {
                cashback = (jumlah > 1000000) ? jumlah * 0.10 : jumlah * 0.05;
            }

            saldo -= jumlah - cashback;
            return true;
        } else {
            catatPercobaanGagal();
            return false;
        }
    }
}
