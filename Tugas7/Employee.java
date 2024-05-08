

// public abstract class Employee {
//     private String name;
//     private String noKTP;

//     public Employee(String name, String noKTP) {
//         this.name = name;
//         this.noKTP = noKTP;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getNoKTP() {
//         return noKTP;
//     }

//     public abstract double earnings(); // pendapatan

//     public String toString() {
//         return String.format("    " + getName() + "\nNo.:" + getNoKTP());
//     }
// }


import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;

    public Employee(String name, String noKTP, LocalDate tanggalLahir) {
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tanggalLahir;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public abstract double earnings(); // pendapatan

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == tanggalLahir.getMonth() && today.getDayOfMonth() == tanggalLahir.getDayOfMonth();
    }

    public String toString() {
        return String.format("    " + getName() + "\nNo.:" + getNoKTP() + "\nTanggal Lahir: " + getTanggalLahir());
    }
}


