
public class demoRasional {
   public static void main(String[] args) {
       Rasional R1 = new Rasional(1,2);
       Rasional R2 = new Rasional(1,3);
       
       System.out.println("R1 rasional? : " + R1.isRasional());
       System.out.println("R2 rasional? : " + R2.isRasional() + "\n");
       
       
       System.out.println("R1 > R2 : " + R1.moreThan(R2) +"\n");
    //    System.out.println("R1 < R2 : " + R1.lessThan(R2) +"\n");
    //    System.out.println("R1 <= R2 : " + R1.lessThanEqual(R2) +"\n");
    //    System.out.println("R1 >= R2 : " + R1.moreThanEqual(R2) +"\n");
        System.out.println();
       
       System.out.print("R1 : " );
       R1.cetak();
       
       System.out.print("R2 : ");
       R2.cetak();
       
       System.out.println();
       
       
       R1.Sederhana();
       R2.Sederhana();
       
       System.out.print("R1 : ");
       R1.cetak();
       
       System.out.print("R2 : ");
       R2.cetak();
       System.out.println();
       
       
       System.out.println("Setelah dilakukan cast ke double menjadi : ");
       System.out.println("R1 : " + R1.Cast());
       System.out.println("R2 : " + R2.Cast());
       System.out.println();
       
       R1.negasi();
       System.out.println("Unary dari R1 : ");
       R1.cetak();
       
       R1.unaryPlus(R2);
       System.out.println("Nilai dari 'R1 += R2 : ");
       R1.cetak();
       System.out.println("");
       
       System.out.println("Nilai dari 'R1 - R2'");
       R1.kurangkan(R2);
       R1.cetak();
       
       System.out.println("Nilai dari 'R1 * R2'");
       R1.kalikan(R2);
       R1.cetak();
       
       System.out.println("Nilai dari 'R1 / R2'");
       R1.bagi(R2);
       R1.cetak();
   }
}

