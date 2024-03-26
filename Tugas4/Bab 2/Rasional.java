
 public class Rasional {
     private int pembilang, penyebut;
     
     public Rasional() {
         pembilang = 0;
         penyebut = 0;
     }
     
     public Rasional(int pbl, int pyb) {
         pembilang = pbl;
         penyebut = pyb;
     }
     
     public boolean isRasional() {
         return (penyebut !=0);
     }
     
     public void Sederhana() {
         int temp, A, B;
         if (penyebut == 0) {
             return;
         }
         
         A = (pembilang < penyebut) ? penyebut:pembilang;
         B = (pembilang < penyebut) ? pembilang:penyebut;
         
         //while awalnya ini no 3
         // Untuk mengubah dari while ke for, hanya perlu perubahan sintaks dimana di dalam for loop
        // tidak ada nilai awal (initial condition), dan nilai increment. Di dalam for loop hanya ada
        // syarat loop berjalan, yaitu ketika nilai B != 0. Ketika nilai B belum mencapai 0, maka loop
        // terus berjalan
         for (;B != 0;) {
             temp = A % B;
             A = B;
             B = temp;
         }
         
         pembilang /= A;
         penyebut /= A;
     }
     
     public double Cast() {
         return (penyebut == 0.0) ? 0.0 : (double)pembilang / (double)penyebut;
     }
     
     public boolean moreThan(Rasional A) {
         return (pembilang * A.penyebut > penyebut * A.pembilang);
     }
     //no 2
     public boolean lessThan(Rasional A) {
         return (pembilang * A.penyebut < penyebut * A.pembilang);
     }
     
     public boolean lessThanEqual(Rasional A) {
         return (pembilang * A.penyebut <= penyebut * A.pembilang);
     }
     
      public boolean moreThanEqual(Rasional A) {
         return (pembilang * A.penyebut >= penyebut * A.pembilang);
     }
     //Akhir no2
     public void negasi() {
         pembilang = -pembilang;
     }
     
     public void unaryPlus(Rasional A) {
         pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
         penyebut *= A.penyebut;
     }
     // ini no 4
     public void kurangkan(Rasional B) {
         this.pembilang = this.pembilang * B.penyebut - B.pembilang * this.penyebut;
         this.penyebut = this.penyebut * B.penyebut;
     }
     
     public void kalikan(Rasional C) {
         this.pembilang = this.pembilang * C.pembilang;
         this.penyebut = this.penyebut * C.penyebut;
     }
     
     public void bagi(Rasional D) {
         Rasional rasionalBagi = new Rasional(D.penyebut, D.pembilang);
         this.kalikan(rasionalBagi);
     }
     public void cetak() {
         System.out.println(pembilang + "/" + penyebut);
     
     
 }
}