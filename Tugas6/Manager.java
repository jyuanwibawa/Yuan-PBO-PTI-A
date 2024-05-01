public class Manager extends Employee {
    private double bonus;

    //Catatan no 4
    // Akan terjadi error karena Constructor Mismatch: Konstruktor yang Anda gunakan untuk membuat objek Manager 
    //             menerima parameter yang berbeda dengan konstruktor yang ada di kelas Manager. Konstruktor yang didefinisikan 
    //             dalam Manager memerlukan tambahan parameter double bonus, tetapi di MainEmployee.java, Anda memanggil konstruktor 
    //             tanpa memberikan nilai untuk bonus.

    public Manager (String name,  double salary, int year, int month, int day // no 4tambahkan, double bonus
    ) 
    {
        // Catatatan no 2
        // Perlu dilakukan karena konstruktor superclass biasanya melakukan inisialisasi
        //         penting yang mungkin diperlukan oleh subclass. Dengan memanggil konstruktor superclass, 
        //           memastikan bahwa semua inisialisasi yang diperlukan telah dilakukan sebelum melakukan 
        //         inisialisasi tambahan di subclass.


        // catatan no 6
        // Di konstructor Manager, parameter nya sesuai dengan yang di class Main, tapi metode super
        // (yang memanggil konstructor di Employee) hanya memasukkan parameter name. Sehingga,
        // parameter lainnya (salary, month, day, year) tidak diteruskan ke konstructor di Employee.
        // Oleh karena itu, parameter dari instansiasi Manager bernama boss hanya mengubah nama,
        // sisa nya nilai default. Pada saat pemanggilan metode getter, nilai salary awalnya 0. Tetapi
        // karena ada method di Main yang mengubah nilai salary, Maka nilai akhir salary boss adalah 5000

        // catatan no 7
        // Untuk superclass nya, ketika kita lihat method nya maka sudah menggunakan modifier
        //         public. Gunanya method public ini adalah dapat diakses terhadap semua package atau semua
        //         class di dalam satu project.
        //         Dalam konsep inheritance, ketika ada subclass yang ingin menggunakan variabel/method dari
        //         superclass, maka variabel/method dari superclass itu hendaknya diubah access modifiernya
        //         menjadi protected. Sehingga variabel itu hanya dapat diakses melalui kelas itu sendiri dan
        //         subclassnya.
        //         Sedangkan, kalau variabel superclassnya menggunakan default, maka variabel itu hanya
        //         dapat diakses di kelas itu sendiri, di subclass nya, dan class lain yang terdapat dalam satu
        //         package.
        //         Jika ingin variabelnya hanya dapat diakses terhadap class itu sendiri, maka menggunakan
        //         access modifier private.

        super(name //no 6 dihpus no 8 tinnggal enter aja biar ga error
        , salary, year, month, day
        );
        this.bonus = 0;   
    }
    public void setBonus(double bonus) {
       // no 5 thisnya dihilangkan
        this.bonus = bonus;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
    

}
