import java.util.Scanner;

public class MainnPerpus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        
        System.out.println("Nama : Jati Yuana Marta Wibawa");
	    System.out.println("NIM  : 235150607111006");
        System.out.println("Selamat datang di perpustakaan");
        System.out.println("Kami memiliki 7 kategori buku : ");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n0. Keluar");
        System.out.print("Pilih kategori yang diinginkan : "); 
        int pilihanMenu = input.nextInt();
        
        if (pilihanMenu >= 1 && pilihanMenu <= 7) {
            perpustakaan.tampilkanBuku(pilihanMenu);
        } else if (pilihanMenu == 0) {
            System.out.println("Terima kasih telah menggunakan layanan perpustakaan.");
        } else {
            System.out.println("Pilihan tidak valid. Silakan pilih kategori yang tersedia.");
        }
        
        input.close();
    }
}

class Perpustakaan {
    private final String[] kategori = {"Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};
    private final String[][] daftarBuku = {
        {"Data Structures and Algorithms", "Pemrograman Web"},
        {"Sejarah Dunia yang Disembunyikan", "Filsafat Pancasila"},
        {"10 Dosa Besar Soeharto", "Sejarah Indonesia"},
        {"Hadis Nabi", "Dasar Dasar Pendidikan Agama Islam"},
        {"Psikologi Kepribadian", "Teori Belajar dan Pembelajaran"},
        {"Dasar Dasar Ilmu Politik", "Politik dan Kekuasaan"},
        {"Hujan", "Laskar Pelangi"}
    };
    private final String[][][] penulis = {
        {{"Michael T. Goodrich", "Roberto T."}, {"Priyanto H.", "-"}},
        {{"Jonathan Black", "-"}, {"Haelan", "-"}},
        {{"Wimanjaya K.", "-"}, {"Kemdikbud", "-"}},
        {{"Muhammad Ajaj Al-Khatib", "-"}, {"Maman", "-"}},
        {{"Lynn Wileox", "-"}, {"Nurlina", "-"}},
        {{"Miriam B.", "-"}, {"Ibnu Qutaibah", "-"}},
        {{"Tere Liye", "-"}, {"Andrea Hirata", "-"}}
    };
    
    public void tampilkanBuku(int pilihanMenu) {
        System.out.println("\n=======================");
        System.out.println("Kategori : " + kategori[pilihanMenu - 1] + "\n");
        for (int i = 0; i < daftarBuku[pilihanMenu - 1].length; i++) {
            System.out.println("Judul: " + daftarBuku[pilihanMenu - 1][i]);
            System.out.println("Penulis 1: " + penulis[pilihanMenu - 1][i][0]);
            System.out.println("Penulis 2: " + penulis[pilihanMenu - 1][i][1]);
            System.out.println();
        }
    }
}
