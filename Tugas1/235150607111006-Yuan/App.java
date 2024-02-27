import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> dataList = new ArrayList<>();

        dataList.add("Jati");
        dataList.add("Yuana");
        dataList.add("Marta");
        dataList.add("Wibawa");
        dataList.add("anggur");

        String dusername = "Jyuanwibawa";
        String dsandi = "123";

        login(input, dusername, dsandi);
        search(input, dataList);
    }

    public static void login(Scanner input, String dusername, String dsandi) {
        System.out.println("Masukkan Username");
        String Username = input.nextLine();

        System.out.println("Masukkan Password");
        String Sandi = input.nextLine();

        if (Username.equals(dusername) && Sandi.equals(dsandi)) {
            System.out.println("Login berhasil!");
            System.out.println("Selamat Datang " + dusername);
        } else {
            System.out.println("Login gagal. Username " + Username + " Tidak terdaftar");
            System.exit(0);
        }
    }

    public static void search(Scanner input, ArrayList<String> dataList) {
        boolean temu = false;
        while (!temu) {
            System.out.println("=================================================");
            System.out.println("PENCARIAN");
            System.out.println("Masukkan kata kunci pencarian:");
            String keyword = input.nextLine();

            boolean temuulang = false;
            for (String item : dataList) {
                if (item.equalsIgnoreCase(keyword)) {
                    System.out.println("Data ditemukan: " + item);
                    temu = true;
                    temuulang = true;
                    break;
                }
            }

            if (!temuulang) {
                System.out.println("Data tidak ditemukan. Silakan coba lagi.");
                System.out.println("Apakah Anda ingin menambahkan data baru? (ya/tidak)");
                String tambahData = input.nextLine();
                if (tambahData.equalsIgnoreCase("ya")) {
                    System.out.println("Masukkan data baru:");
                    String newData = input.nextLine();
                    dataList.add(newData);
                    System.out.println("Data berhasil ditambahkan: " + newData);
                    System.out.println("Data baru yang berhasil ditambahkan:");
                    System.out.println("====================================");
                    for (String data : dataList) {
                        System.out.println(data);
                    }
                }
            }
        }
    }
}
