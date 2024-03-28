import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ngeset default tidak bisa berubah
        long nomorPelanggan = 3812345678L;
        String nama = "Jati Yuana Marta Wibawa";

        // menampilkan  nomor pelanggan & nama yang udah di setting default
        System.out.println("Nomor Pelanggan: " + nomorPelanggan);
        System.out.println("Nama: " + nama);

        // kayak memanggil class akun kedalam kelas main
        Akun akun = new Akun( 38);

        // Meminta masukan PIN
        System.out.print("Masukkan PIN: ");
        int pin = scanner.nextInt();
        int counter = 1;
        while (pin != 1234 && counter < 3) {
            System.out.println("PIN salah. Masukkan lagi.");
            pin = scanner.nextInt();
            counter++;
        }

        if (pin == 1234) {
            System.out.println("Pelanggan jenis rekening: " + akun.getJenisRekeningString());
            System.out.println("Saldo Anda: " + akun.getSaldo());
            System.out.print("Masukkan harga pembelian: ");
            int hargaPembelian = scanner.nextInt();

            // Memeriksa apakah saldo cukup
            if (hargaPembelian > akun.getSaldo()) {
                System.out.println("Saldo tidak cukup.");
                System.out.print("Masukkan jumlah yang ingin ditop up: ");
                int topUpAmount = scanner.nextInt();
                akun.tambahSaldo(topUpAmount);
                System.out.println("Saldo Anda sekarang: " + akun.getSaldo());

                // Memasukkan Harga ulang
                System.out.print("Masukkan harga pembelian : ");
                hargaPembelian = scanner.nextInt();
            }

            
            akun.kurangiSaldo(hargaPembelian);
            int cashback = akun.hitungCashback(hargaPembelian);
            System.out.println("Cashback yang didapat: " + cashback);
            System.out.println("Saldo Anda sekarang: " + akun.getSaldo());
        } else {
            System.out.println("PIN salah lebih dari 3 kali. Akun terblokir.");
        }
    }
}
