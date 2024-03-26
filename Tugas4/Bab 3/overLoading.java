import java.util.Scanner;
 public class overLoading {
    // no3
    static double nilai = 0;
     public static void HitungLuas(int a,int b){
         int nilai = a*b;
         System.out.println("maka hasil luas : "+nilai);
     }

     //default
    //  public static double HitungLuas(double value, double value2){
    //     double nilai = value*value2;
    //     return nilai;
    //  }
        //no 2 Jika pada baris 7, pada parameter double value dan double value2 di hapus dan di ganti
        // menjadi int a dan int b apa yang terjadi? Jelaskan!
        //  public static double HitungLuas(int a, int b){
        //     double nilai = a*b;
        //     return nilai;
        //  }

        // no 3
        public static void HitungLuas(double value, double value2){
            nilai = value*value2;
            
         }
     
     
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         System.out.print("masukkan nilai integer 1 : ");
         int integer1 = in.nextInt();
         System.out.print("masukkan nilai integer 2 : ");
         int integer2 = in.nextInt();       
         HitungLuas(integer1, integer2);

         //default
        //  System.out.print("masukkan nilai double 1 : ");
        //  double double1 = in.nextDouble();
        //  System.out.print("masukkan nilai double 2 : ");
        //  double double2 = in.nextDouble();
        //  HitungLuas(integer1, integer2);

        // no3
         System.out.print("masukkan nilai double 1 : ");
         double double1 = in.nextDouble();
         System.out.print("masukkan nilai double 2 : ");
         double double2 = in.nextDouble();
         HitungLuas(double1, double2);
         
         
     
        // //default
        // System.out.println("Maka hasil luas : "+ HitungLuas(double1, double2));

        // //no 3
        System.out.println("Maka Hasil luas :"+ nilai);
     }
 }
 