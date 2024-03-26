
// public class mainStudent {
//     public static void main(String[] args) {
//         Student anna = new Student();
//         anna.setNama("Anna");
//         anna.setAddress("Malang");
//         anna.setAge(20);
//         anna.setMath(100);
//         anna.setScience(89);
//         anna.setEnglish(80);
//         anna.displayMessage();


//         System.out.println("----------------");
//         Student chris = new Student("chris", "kediri", 21);
//         chris.setMath(70);
//         chris.setScience(60);
//         chris.setEnglish(90);
//         chris.displayMessage();

//        System.out.println("====================");
//        anna  = new Student ("anna", "Batu", 18);
//        anna.displayMessage();
//         //Tambhan no 2 & 3
//        System.out.println("==========================");
//        Student Yuan = new Student("Yuan", "Tarakan", 19, 70, 90, 60);
//        Yuan.displayMessage();

//        System.out.println("========================");
//        chris.setAddress("Surabaya");
//        chris.setAge(22);
//        chris.displayMessage();
//     }
// }


//no 4
// a.Menambahkan scanner
// b. Menerima input jumlahSiswa
// b. Membuat array untuk objek Student dengan ukuran sesuai jumlahSiswa
// c. Menerima input data (nama, alamat, umur, dan nilai) untuk setiap siswa sesuai dengan
// jumlahSiswa yang diinginkan
// d. Setelah menerima input dan menyimpan data, maka dibuat inisiasi objek Student dengan
// index array (membuat objek Student berulang kali sesuai dengan index array) dan mengisinya
// dengan parameter data di construktornya
// e. Loop berlanjut sesuai dengan jumlahSiswa
// f. Menampilkan data siswa beserta status kelulusan dengan array. Array tersebut memanggil
// method displayMessage() dengan objek Student sesuai dengan index array (student[id]
import java.util.Scanner;

public class mainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine(); 

        Student[] siswa = new Student[jumlahSiswa]; 

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nilai Matematika: ");
            double math = scanner.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double english = scanner.nextDouble();
            System.out.print("Nilai Sains: ");
            double science = scanner.nextDouble();
            scanner.nextLine(); 

           
            siswa[i] = new Student(nama, alamat, umur, math, english, science);
        }

       
        System.out.println("\nInformasi Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("======");
            siswa[i].displayMessage();
        }

        scanner.close(); 
    }
}
