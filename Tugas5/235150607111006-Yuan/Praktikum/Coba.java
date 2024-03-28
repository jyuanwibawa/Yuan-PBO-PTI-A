import java.util.Scanner;

public class Coba {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelanggan = scanner.nextLine();

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan saldo awal pelanggan: ");
        double saldoAwal = scanner.nextDouble();

        Pelanggan pelanggan = new Pelanggan(nomorPelanggan, namaPelanggan, saldoAwal);

        System.out.print("Masukkan jumlah pembelian: ");
        double jumlahPembelian = scanner.nextDouble();

        System.out.print("Masukkan jumlah top-up: ");
        double jumlahTopUp = scanner.nextDouble();

        if (!pelanggan.diblokir()) {
            if (pelanggan.pembelian(jumlahPembelian)) {
                System.out.println("Pembelian berhasil!");
                System.out.println("Sisa Saldo: Rp" + pelanggan.getSaldo());
            } else {
                System.out.println("Pembelian gagal! Saldo tidak mencukupi atau PIN salah.");
            }

            pelanggan.topUp(jumlahTopUp);
            System.out.println("Top-up berhasil!");
            System.out.println("Saldo Sekarang: Rp" + pelanggan.getSaldo());
        } else {
            System.out.println("Akun diblokir karena terlalu banyak percobaan autentikasi yang gagal.");
        }

        scanner.close();
    }
}
