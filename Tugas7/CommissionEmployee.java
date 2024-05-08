
// public class CommissionEmployee extends Employee {
//     private double grossSales;// penjualan per minggu
//     private double commissionRate;// komisi

//     public CommissionEmployee(String name, String noKTP, double sales, double rate) {
//         super(name, noKTP);
//         setGrossSales(sales);
//         setCommissionRate(rate);
//     }

//     public void setGrossSales(double sales) {
//         grossSales = sales;
//     }

//     public double getGrossSales() {
//         return grossSales;
//     }

//     public void setCommissionRate(double rate) {
//         commissionRate = rate;
//     }

//     public double getCommissionRate() {
//         return commissionRate;
//     }

//     public double earnings() {
//         return getCommissionRate() * getGrossSales();
//     }

//     public String toString(){
//             return String.format("Commision employee: "+super.toString()+"\ngross sales: "+getGrossSales()+"\ncommission rate"+getCommissionRate());
//     }
// }


import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double sales, double rate) {
        super(name, noKTP, tanggalLahir);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        double earnings = getCommissionRate() * getGrossSales();
        if (isBirthday()) {
            earnings += 100000; // Menambahkan bonus jika hari ulang tahun
        }
        return earnings;
    }

    public String toString() {
        return String.format("Commission employee: " + super.toString() + "\nGross sales: " + getGrossSales() + "\nCommission rate: " + getCommissionRate());
    }
}
