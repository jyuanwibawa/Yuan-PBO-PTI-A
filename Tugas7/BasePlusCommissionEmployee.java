
// public class BasePlusCommissionEmployee extends
//         CommissionEmployee {

//     private double baseSalary;// gaji pokok tiap minggu

//     public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary) {
//         super(name, noKTP, sales, rate);
//         setBaseSalary(salary);
//     }

//     public void setBaseSalary(double salary) {
//         baseSalary = salary;
//     }

//     public double getBaseSalary() {
//         return baseSalary;
//     }

//     public double earnings() {
//         return getBaseSalary() + super.earnings();
//     }

//     public String toString() {

//         return String.format("Base-Salaried " +
//                 super.toString() + "\nbase salary " + getBaseSalary());
//     }
// }
//
//no 4
import java.time.LocalDate;
    public class BasePlusCommissionEmployee extends CommissionEmployee {
        private double baseSalary;

        public BasePlusCommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double sales, double rate, double salary) {
            super(name, noKTP, tanggalLahir, sales, rate);
            setBaseSalary(salary);
        }

        public void setBaseSalary(double salary) {
            baseSalary = salary;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public double earnings() {
            double earnings = getBaseSalary() + super.earnings();
            if (isBirthday()) {
                earnings += 100000; // Menambahkan bonus jika hari ulang tahun
            }
            return earnings;
        }

        public String toString() {
            return String.format("Base-Salaried " + super.toString() + "\nBase salary: " + getBaseSalary());
        }
    }
