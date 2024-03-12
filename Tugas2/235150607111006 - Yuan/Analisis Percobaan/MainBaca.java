public class MainBaca {

    public static void main(String[] args) {
      
        Baca buku = new Baca(50, 100);

        System.out.println("Jumlah Halaman: " + buku.getHalaman());
        System.out.println("Kata Per Hari: " + buku.getKata());

        double waktuMenulis = buku.hitungWaktuMenulis();
        System.out.println("Waktu yang dibutuhkan untuk menulis 1 buku: " + waktuMenulis + " hari");
    }
}