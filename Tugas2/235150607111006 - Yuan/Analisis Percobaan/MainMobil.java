//  default
// public class MainMobil {

//     public static void main(String[] args) {

//        Mobil m1 = new Mobil();
//        m1.setKecepatan(50);
//        m1.setmanudaktur("Toyota");
//        m1.setNoPlat("AB 1231 UA");
//        m1.setWarna("Merah");
//        m1.displayMessage();
//        System.out.println("==============");

//        Mobil m2 = new Mobil();
//        m1.setKecepatan(100);
//        m1.setmanudaktur("Mitsibisi");
//        m1.setNoPlat("N 1134 AG");
//        m1.setWarna("Pink");
//        m1.displayMessage();
//        System.out.println("==============");
//        System.out.println("Mobil pada objek m1 dirubah menjadi warna hijau");
//        m1.setWarna("Hijau");
//        m1.displayMessage();
//     }
// } 





// no 3 (meminta masukan dari user dan buat menjadi interaktif)
import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Mobil m1 = new Mobil();
        System.out.println("Masukkan kecepatan mobil:");
        int kecepatan1 = scanner.nextInt();
        m1.setKecepatan(kecepatan1);
        System.out.println("Masukkan manufaktur mobil:");
        String manufaktur1 = scanner.next();
        m1.setManufaktur(manufaktur1);
        System.out.println("Masukkan nomor plat mobil:");
        String noPlat1 = scanner.next();
        m1.setNoPlat(noPlat1);
        System.out.println("Masukkan warna mobil:");
        String warna1 = scanner.next();
        m1.setWarna(warna1);
        System.out.println("==============");
        m1.displayMessage();
        
        
        System.out.println("==============");
        Mobil m2 = new Mobil();
        System.out.println("Masukkan kecepatan mobil:");
        int kecepatan2 = scanner.nextInt();
        m2.setKecepatan(kecepatan2);
        System.out.println("Masukkan manufaktur mobil:");
        String manufaktur2 = scanner.next();
        m2.setManufaktur(manufaktur2);
        System.out.println("Masukkan nomor plat mobil:");
        String noPlat2 = scanner.next();
        m2.setNoPlat(noPlat2);
        System.out.println("Masukkan warna mobil:");
        String warna2 = scanner.next();
        m2.setWarna(warna2);
        System.out.println("==============");
        m2.displayMessage();
        
        
        System.out.println("==============");
        System.out.println("Mobil pada objek m1 dirubah menjadi warna hijau");
        m1.setWarna("Hijau");
        m1.displayMessage();
        
        scanner.close(); 
    }
}
