
public class lingkaran {
    int alas, tinggi;
    
    public lingkaran(int alas) {
        this.alas = alas;
    }
        
    public lingkaran(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    // no 2 pada class Lingkaran tambahkan constraktor dengan parameter int tinggi, apa yang terjadi dan jelaskan
    // public Lingkaran(int tinggi){
    //      this.tinggi = tinggi;
    //  }

    //no 3
    public lingkaran(String alas, String tinggi) {
        convertStringtoInt(alas, tinggi);
    }
    
    private void convertStringtoInt(String alas, String tinggi) {
        this.alas = Integer.parseInt(alas);
        this.tinggi = Integer.parseInt(tinggi);
    }
    public void setAlas(int alas){
        this.alas = alas;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int getAlas(){
        return alas;
    }  
    
    public int getTinggi(){
        return tinggi;
    }
    
    public double hitungLuas(){
        double hasil = (double)(getTinggi()*getAlas())/2;
        return hasil;
    }

     public void displayMessage(){
        System.out.println("Hitung Luas : "+hitungLuas());
     }
}