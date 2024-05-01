public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
       //Getter: Digunakan untuk mengambil nilai properti privat.
    //Setter: Digunakan untuk menetapkan nilai properti privat.
    // Setter dan getter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method untuk mendapatkan status
    public String getStatus() {
        String[] prodi = {"", "Teknik Informatika", "Teknik Komputer", "Sistem Informasi", "", "Pendidikan Teknologi Informasi", "Teknologi Informasi"};
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodiIndex = Character.getNumericValue(nim.charAt(6));
        return prodi[prodiIndex] + ", 20" + angkatan;
    }

    // Method untuk mendapatkan beasiswa
    public double getBeasiswa() {
        if (ipk < 3.0) {
            return 0;
        } else if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else {
            return 75.0;
        }
    }

    // Method toString
    @Override
    public String toString() {
        return super.toString() + "\nnim : " + nim + "\nipk : " + ipk + "\nstatus : " + getStatus();
    }
}
