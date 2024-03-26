
public class Student {
    private String nama;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double everage;

    public Student() {
        nama = "";
        address = "";
        age = 0;
    }
    //no 2
    // Kode tersebut merupakan tambahan constructor pada kelas Student dengan parameter nama,
    // alamat, umur, dan nilai ketiga pelajaran. Pada methode displayMessage juga disesuaikan agar
    // menampilkan output “nilai rata rata adalah … “.


    public Student(String n, String a, int ag, double math, double english, double science) {
        nama = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }

    public Student (String n, String a, int ag) {
        nama = n;
        address = a;
        age = ag;
    }

    public void setNama (String n) {
        nama = n;
    }

    public void setAddress (String a) {
        address = a;
    }

    public void setAge (int ag) {
        age = ag;
    }

    public void setMath (int math) {
        mathGrade = math;
    }

    public void setEnglish ( int english) {
        englishGrade = english;
    }

    public void setScience (int science) {
        scienceGrade = science;
    }

    private double getAverage () {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade)/3;
        return result;
    }
    //no 3
    // Kode tersebut merupakan tambahan methode pada kelas Student dengan return type boolean.
    
    private boolean statusAkhir() {
        return everage >= 61;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama : " + nama);
        System.out.println("Beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        // no3
        // Pada methode displayMessage juga disesuaikan agar menampilkan output “Status Akhir : 
        // lulus atau remidi (Boolean)”.
        System.out.println("Status akhir: " + (statusAkhir() ? "Lolos" : "Remidi"));
    }
}
