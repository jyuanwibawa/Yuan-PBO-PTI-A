public class MainManusia {
    public static void main(String[] args) {
        // Testcase Manusia
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

        // Testcase MahasiswaFILKOM
        MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 2.5, "D", "444", true, false);
        System.out.println(b);

        // Testcase Pekerja
        Pekerja c = new Pekerja(2000, 2019, 2, "G", "777", true, true);
        System.out.println(c);

        // Testcase Manager
        Manager d  = new Manager("HRD", 7500, 2009, 0, "J", "101010", true, true);
        System.out.println(d);
    }
}
