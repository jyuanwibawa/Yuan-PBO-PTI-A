
// public class HourlyEmployee extends Employee {
//     private double wage; // upah per jam
//     private double hours; // jumlah jam tiap minggu

//     public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked) {
//         super(name, noKTP);
//         setWage(hourlyWage);
//         setHours(hoursWorked);
//     }

//     public void setWage(double hourlyWage) {
//         wage = hourlyWage;
//     }

//     public double getWage() {
//         return wage;
//     }

//     public void setHours(double hoursWorked) {
//         hours = hoursWorked;
//     }

//     public double getHours() {
//         return hours;
//     }

//     public double earnings() {
//         if (getHours() <= 40)
//             return getWage() * getHours();
//         else
//             return 40 * getWage() + (getHours() - 40) *
//                     getWage() * 1.5;
//     }

//     public String toString(){
//     return String.format("Hourly employee: "+super.toString() +"\nhourly   wage"+getWage()+"\nhours   worked: "+getHours());
//     }
// }



import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, String noKTP, LocalDate tanggalLahir, double wage, double hours) {
        super(name, noKTP, tanggalLahir);
        setHourlyWage(wage);
        setHoursWorked(hours);
    }

    public void setHourlyWage(double wage) {
        hourlyWage = wage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHoursWorked(double hours) {
        hoursWorked = hours;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double earnings() {
        double earnings = getHourlyWage() * getHoursWorked();
        if (isBirthday()) {
            earnings += 100000; // Menambahkan bonus jika hari ulang tahun
        }
        return earnings;
    }

    public String toString() {
        return String.format("Hourly employee: " + super.toString() + "\nHourly wage: " + getHourlyWage() + "\nHours worked: " + getHoursWorked());
    }
}
