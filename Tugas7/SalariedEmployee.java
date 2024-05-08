

// public class SalariedEmployee extends Employee {
//     private double weeklySalary; // gaji/minggu

//     public SalariedEmployee(String name, String noKTP, double salary) {
//         super(name, noKTP);
//         setWeeklySalary(salary);
//     }

//     public void setWeeklySalary(double salary) {
//         weeklySalary = salary;
//     }

//     public double getWeeklySalary() {
//         return weeklySalary;

//     }

//     public double earnings() {
//         return getWeeklySalary();
//     }

//     public String toString() {
//         return   String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());

//         }
//     }
        

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String noKTP, LocalDate tanggalLahir, double salary) {
        super(name, noKTP, tanggalLahir);
        setMonthlySalary(salary);
    }

    public void setMonthlySalary(double salary) {
        monthlySalary = salary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double earnings() {
        double earnings = getMonthlySalary();
        if (isBirthday()) {
            earnings += 100000; // Menambahkan bonus jika hari ulang tahun
        }
        return earnings;
    }

    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nMonthly salary: " + getMonthlySalary());
    }
}

