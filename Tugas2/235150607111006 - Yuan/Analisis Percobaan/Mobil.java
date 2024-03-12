// public class Mobil {
//     private String noPlat;
//     private String warna;
//     private String manufaktur;
//     private int kecepatan;

//     public void setNoPlat(String s){
//         noPlat = s;
//     }
//     public void setWarna(String s){
//         warna = s;
//     }
//     public void setmanudaktur(String s){
//         manufaktur = s;
//     }
//     public void setKecepatan(int i){
//         kecepatan = i;
//     }
    
//     public void displayMessage(){
//         System.out.println("Mobiil anda adalah bermerek "+manufaktur);
//         System.out.println("Mempunyai nomor plat "+noPlat);
//         System.out.println("Dan Mampu menempuh kecepatan"+kecepatan);
//     }
// }

// no 4 Tambahkan method pada class mobil bernama setWaktu yang berparameter double, yang kemudian disimpan pada variabel waktu! (Ketetuannya adalah user harus menginputkan dalam satuan jam

// import java.util.Scanner;

// public class Mobil {
//     private String noPlat;
//     private String warna;
//     private String manufaktur;
//     private int kecepatan;
//     private double waktu;

//     public void setNoPlat(String s) {
//         noPlat = s;
//     }

//     public void setWarna(String s) {
//         warna = s;
//     }

//     public void setManufaktur(String s) {
//         manufaktur = s;
//     }

//     public void setKecepatan(int i) {
//         kecepatan = i;
//     }
    
//     public void setWaktu(double hours) {
//         waktu = hours;
//     }

//     public void displayMessage() {
//         System.out.println("Mobil anda adalah bermerek " + manufaktur);
//         System.out.println("Mempunyai nomor plat " + noPlat);
//         System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " km/jam dalam waktu " + waktu + " jam.");
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Mobil m1 = new Mobil();

//         System.out.println("Masukkan kecepatan mobil (km/jam):");
//         int kecepatan1 = scanner.nextInt();
//         m1.setKecepatan(kecepatan1);

//         System.out.println("Masukkan manufaktur mobil:");
//         String manufaktur1 = scanner.next();
//         m1.setManufaktur(manufaktur1);

//         System.out.println("Masukkan nomor plat mobil:");
//         String noPlat1 = scanner.next();
//         m1.setNoPlat(noPlat1);

//         System.out.println("Masukkan warna mobil:");
//         String warna1 = scanner.next();
//         m1.setWarna(warna1);

//         System.out.println("Masukkan waktu tempuh mobil (jam):");
//         double waktuTempuh1 = scanner.nextDouble();
//         m1.setWaktu(waktuTempuh1);

//         System.out.println("==============");
//         m1.displayMessage();

//         scanner.close();
//     }
// }

// no5
// import java.util.Scanner;

// public class Mobil {
//     private String noPlat;
//     private String warna;
//     private String manufaktur;
//     private int kecepatan;
//     private double waktu;

//     public void setNoPlat(String s) {
//         noPlat = s;
//     }

//     public void setWarna(String s) {
//         warna = s;
//     }

//     public void setManufaktur(String s) {
//         manufaktur = s;
//     }

//     public void setKecepatan(int i) {
//         kecepatan = i;
//     }
    
//     public void setWaktu(double jam) {
//         waktu = jam;
//         rubahSekon(waktu); 
//     }
    
//     private void rubahSekon(double jam) {
//         double setwaktu = jam * 3600; 
//         System.out.println("Waktu dalam detik: " + setwaktu);
//     }

//     public void displayMessage() {
//         System.out.println("Mobil anda adalah bermerek " + manufaktur);
//         System.out.println("Mempunyai nomor plat " + noPlat);
//         System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " km/jam dalam waktu " + waktu + " jam.");
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Mobil m1 = new Mobil();

//         System.out.println("Masukkan kecepatan mobil (km/jam):");
//         int kecepatan1 = scanner.nextInt();
//         m1.setKecepatan(kecepatan1);

//         System.out.println("Masukkan manufaktur mobil:");
//         String manufaktur1 = scanner.next();
//         m1.setManufaktur(manufaktur1);

//         System.out.println("Masukkan nomor plat mobil:");
//         String noPlat1 = scanner.next();
//         m1.setNoPlat(noPlat1);

//         System.out.println("Masukkan warna mobil:");
//         String warna1 = scanner.next();
//         m1.setWarna(warna1);

//         System.out.println("Masukkan waktu tempuh mobil (jam):");
//         double waktuTempuh1 = scanner.nextDouble();
//         m1.setWaktu(waktuTempuh1);

//         System.out.println("==============");
//         m1.displayMessage();

//         scanner.close();
//     }
// }


// no 6
// import java.util.Scanner;

// public class Mobil {
//     private String noPlat;
//     private String warna;
//     private String manufaktur;
//     private int kecepatan;
//     private double waktu;

//     public void setNoPlat(String s) {
//         noPlat = s;
//     }

//     public void setWarna(String s) {
//         warna = s;
//     }

//     public void setManufaktur(String s) {
//         manufaktur = s;
//     }

//     public void setKecepatan(int kmPerJam) {
//         kecepatan = kmPerJam;
//         rubahKecepatan(); 
//     }
    
//     private void rubahKecepatan() {
//         double kecepatandetik = kecepatan * 1000 / 3600; 
//         System.out.println("Kecepatan dalam m/s: " +kecepatandetik);
//     }
    
//     public void setWaktu(double jam) {
//         waktu = jam;
//         rubahSekon(); 
//     }
    
//     private void rubahSekon() {
//         double detik = waktu * 3600; 
//         System.out.println("Waktu dalam detik: " + detik);
//     }

//     public void displayMessage() {
//         System.out.println("Mobil anda adalah bermerek " + manufaktur);
//         System.out.println("Mempunyai nomor plat " + noPlat);
//         System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " km/jam dalam waktu " + waktu + " jam.");
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Mobil m1 = new Mobil();

//         System.out.println("Masukkan kecepatan mobil (km/jam):");
//         int kecepatan1 = scanner.nextInt();
//         m1.setKecepatan(kecepatan1);

//         System.out.println("Masukkan manufaktur mobil:");
//         String manufaktur1 = scanner.next();
//         m1.setManufaktur(manufaktur1);

//         System.out.println("Masukkan nomor plat mobil:");
//         String noPlat1 = scanner.next();
//         m1.setNoPlat(noPlat1);

//         System.out.println("Masukkan warna mobil:");
//         String warna1 = scanner.next();
//         m1.setWarna(warna1);

//         System.out.println("Masukkan waktu tempuh mobil (jam):");
//         double waktuTempuh1 = scanner.nextDouble();
//         m1.setWaktu(waktuTempuh1);

//         System.out.println("==============");
//         m1.displayMessage();

//         scanner.close();
//     }
// }





// no 7

import java.util.Scanner;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int kmPerJam) {
        kecepatan = kmPerJam;
        rubahKecepatan(); 
    }
    
    private void rubahKecepatan() {
        double kecepatandetik = kecepatan * 1000 / 3600; 
        System.out.println("Kecepatan dalam m/s: " + kecepatandetik);
    }
    
    public void setWaktu(double jam) {
        waktu = jam;
        rubahSekon(); 
    }
    
    private void rubahSekon() {
        double detik = waktu * 3600; 
        System.out.println("Waktu dalam detik: " + detik);
    }

    public void hitungJarak() {
        double jarak = kecepatan * waktu;
        System.out.println("Jarak yang dapat ditempuh oleh mobil: " + jarak + " m.");
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " km/jam dalam waktu " + waktu + " jam.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobil m1 = new Mobil();

        System.out.println("Masukkan kecepatan mobil (km/jam):");
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

        System.out.println("Masukkan waktu tempuh mobil (jam):");
        double waktuTempuh1 = scanner.nextDouble();
        m1.setWaktu(waktuTempuh1);

        System.out.println("==============");
        m1.displayMessage();
        m1.hitungJarak();

        scanner.close();
    }
}





// no 8
// import java.util.Scanner;

// public class Mobil {
//     private String noPlat;
//     private String warna;
//     private String manufaktur;
//     private int kecepatan;
//     private double waktu;

//     public void setNoPlat(String s) {
//         noPlat = s;
//     }

//     public void setWarna(String s) {
//         warna = s;
//     }

//     public void setManufaktur(String s) {
//         manufaktur = s;
//     }

//     public void setKecepatan(int kmPerJam) {
//         kecepatan = kmPerJam;
//         rubahKecepatan(); 
//     }
    
//     private void rubahKecepatan() {
//         double kecepatandetik = kecepatan * 1000 / 3600; 
//         System.out.println("Kecepatan dalam m/s: " + kecepatandetik);
//     }
    
//     public void setWaktu(double jam) {
//         waktu = jam;
//         rubahSekon(); 
//     }
    
//     private void rubahSekon() {
//         double detik = waktu * 3600; 
//         System.out.println("Waktu dalam detik: " + detik);
//     }

//     public void hitungJarak() {
//         double jarak = kecepatan * waktu / 1000; 
//         System.out.println("Jarak yang dapat ditempuh oleh mobil: " + jarak + " km.");
//     }

//     public void displayMessage() {
//         System.out.println("Mobil anda adalah bermerek " + manufaktur);
//         System.out.println("Mempunyai nomor plat " + noPlat);
//         System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " km/jam dalam waktu " + waktu + " jam.");
//         hitungJarak(); 
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Mobil m1 = new Mobil();

//         System.out.println("Masukkan kecepatan mobil (km/jam):");
//         int kecepatan1 = scanner.nextInt();
//         m1.setKecepatan(kecepatan1);

//         System.out.println("Masukkan manufaktur mobil:");
//         String manufaktur1 = scanner.next();
//         m1.setManufaktur(manufaktur1);

//         System.out.println("Masukkan nomor plat mobil:");
//         String noPlat1 = scanner.next();
//         m1.setNoPlat(noPlat1);

//         System.out.println("Masukkan warna mobil:");
//         String warna1 = scanner.next();
//         m1.setWarna(warna1);

//         System.out.println("Masukkan waktu tempuh mobil (jam):");
//         double waktuTempuh1 = scanner.nextDouble();
//         m1.setWaktu(waktuTempuh1);

//         System.out.println("==============");
//         m1.displayMessage();

//         scanner.close();
//     }
// }
