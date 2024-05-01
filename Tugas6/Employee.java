
// default

//Catatan
// menginisialisasi hireday. hireday adalah variabel bertipe Date, tetapi 
//calendar.getTime() mengembalikan tipe java.util.Date, yang tidak dapat langsung 
//diassign ke hireday.

// import java.sql.Date;
// import java.util.GregorianCalendar;

// public class Employee {
//     private String name;
//     private double salary;
//     private Date hireday;
   
//     public Employee(String name, double salary, int year, int month, int day) {
//         this.name = name;
//         this.salary = salary;
//         GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
//         this.hireday = calendar.getTime(); //errornya disini kak devan
//     }
//     public Date getHireday() {
//         return hireday;
//     }
//     public String getName() {
//         return name;
//     }
//     public double getSalary() {
//         return salary;
//     }
//     public void raiseSalary(double byPercent){
//         double raise = salary* byPercent/100;
//         salary+=raise;
//     }
// }


// Perbaikannya
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name, double salary, int year, int month, int day) {
        //catatan no 5
        // Keyword this digunakan dalam Java untuk merujuk pada instance saat ini dari kelas yang sedang berjalan.
        //         Ini berguna untuk membedakan antara variabel kelas dan parameter metode yang memiliki nama yang sama, 
        //         atau untuk merujuk ke variabel kelas dari dalam metode atau konstruktor.

        //         Dalam konstruktor Employee, menghapus this menyebabkan variabel lokal name dan salary digunakan, 
        //         bukan variabel kelas name dan salary. Ini berarti parameter konstruktor hanya akan menugaskan nilainya
        //         kembali kepada dirinya sendiri, tidak mempengaruhi variabel kelas. Jadi, variabel kelas akan tetap tidak
        //         terinisialisasi.

        //         Dalam konstruktor Manager, menghapus this pada inisialisasi variabel bonus akan menyebabkan variabel
        //         lokal bonus digunakan, bukan variabel kelas bonus. Oleh karen

        // no 5 thisnya dihilangkan
        this.name = name;
        this.salary = salary;
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireday = new Date(calendar.getTimeInMillis());
    }

    // Catatan no 3
    // Karena tidak ada perubahan di kelas main (tidak dipanggil konstraktor dengan parameter
    //             hanya String), maka tidak terjadi apa apa. Konstruktor dengan parameter hanya String tidak
    //             error.


    //no 3 & 6
    // public Employee(String name) {
    //     this.name = name;
    // }
    //no 3
    

    public Date getHireday() {
        return hireday;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    //Catata no 8
//     Error, karena method private hanya dapat diakses di class itu sendiri, sedangkan method di
//                 kelas Employee dipanggil di class lainnya

//                 Kode tidak error, terbukti bahwa method protected hanya dapat diakses melalui class itu
// s               endiri dan subclass nya


    // no 8
    // private Date getHireday() {
    //     return hireday;
    // }
    
    // private String getName() {
    //     return name;
    // }
    
    // private double getSalary() {
    //     return salary;
    // }
    
    // private void raiseSalary(double byPercent) {
    //     double raise = salary * byPercent / 100;
    //     salary += raise;
    // }

    // protected Date getHireday() {
    //     return hireday;
    // }
    
    // protected String getName() {
    //     return name;
    // }
    
    // protected double getSalary() {
    //     return salary;
    // }
    
    // protected void raiseSalary(double byPercent) {
    //     double raise = salary * byPercent / 100;
    //     salary += raise;
    // }
    
    
}

