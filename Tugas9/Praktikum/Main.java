package Praktikum;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan
        Invoice[] invoices = {
                new Invoice("Barang 1", 2, 100),
                new Invoice("Barang 2", 3, 150)
        };
        Employee employee = new Employee(12345, "John Doe", 2000, invoices);

        System.out.println("Informasi Karyawan:");
        System.out.println("Nama: " + employee.getName());
        System.out.println("Nomor Registrasi: " + employee.getRegistrationNumber());
        System.out.println("Gaji Per Bulan: $" + employee.getSalaryPerMonth());

        System.out.println("\nDetail Belanja:");
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println("Produk: " + invoice.getProductName());
            System.out.println("Jumlah: " + invoice.getQuantity());
            System.out.println("Harga per Item: $" + invoice.getPricePerItem());
            System.out.println("Total Harga: $" + invoice.getPayableAmount());
            System.out.println();
        }

        System.out.println("\nTotal Gaji Setelah Dipotong Hutang Belanjaan: $" + employee.getPayableAmount());
    }
}

