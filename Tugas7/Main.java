// public class Main {
//     public static void main(String[] args) {
//     Employee employee = new Employee();
//     }
// }

//no2 & no 3//
// public class Main {
//     public static void main(String[] args) {
//         SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
//         HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
//         CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
//         BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);
        
//         System.out.println("Employees diproses secara terpisah:\n");
//         System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        
//         Employee[] employees = new Employee[4];
//         employees[0] = salariedEmployee;
//         employees[1] = hourlyEmployee;
//         employees[2] = commissionEmployee;
//         employees[3] = basePlusCommissionEmployee;
        
//         System.out.println("Employees diproses secara polimorfisme:\n");
//         for (Employee currentEmployee : employees) {
//             System.out.println(currentEmployee);
//             if (currentEmployee instanceof BasePlusCommissionEmployee) {
//                 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
//                 employee.setBaseSalary(1.10 * employee.getBaseSalary());
//                 System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
//             }
//             System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
//         }
        
//         for (int j = 0; j < employees.length; j++) {
//             System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
//         }
//     }
// }

//no 4
// import java.time.LocalDate;

// public class Main {
//     public static void main(String[] args) {
//         LocalDate tanggalLahir = LocalDate.of(1990, 5, 8); // Contoh tanggal lahir 8 Mei 1990
//         SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", tanggalLahir, 800.00);
//         HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", tanggalLahir, 16.75, 40);
//         CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", tanggalLahir, 10000, .06);
//         BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", tanggalLahir, 5000, .04, 300);

//         System.out.println("Employees diproses secara terpisah:\n");
//         System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

//         Employee[] employees = new Employee[4];
//         employees[0] = salariedEmployee;
//         employees[1] = hourlyEmployee;
//         employees[2] = commissionEmployee;
//         employees[3] = basePlusCommissionEmployee;

//         System.out.println("Employees diproses secara polimorfisme:\n");
//         for (Employee currentEmployee : employees) {
//             System.out.println(currentEmployee);
//             System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
//         }

//         for (int j = 0; j < employees.length; j++) {
//             System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
//         }
//     }
// }

//no 5
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate tanggalLahir = LocalDate.of(1990, 5, 8); // Contoh tanggal lahir 8 Mei 1990
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", tanggalLahir, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", tanggalLahir, 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", tanggalLahir, 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", tanggalLahir, 5000, 0.04, 300);
        Produksi productionEmployee = new Produksi("Eka", "567", tanggalLahir, 5.50, 1000);

        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "pendapatan", basePlusCommissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee, "pendapatan", productionEmployee.earnings());

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
