public class MainKue {
    static Kue[] listKue = new Kue[20];
    
    public static void main(String[] args) {
        inisialisasiKue();
        
 
        System.out.println("Semua Kue:");
        for (Kue kue : listKue) {
            System.out.println(kue);
        }
        

        int totalHargaSemuaKue = hitungTotalHargaSemuaKue();
        System.out.println("\nTotal harga semua kue: " + totalHargaSemuaKue);
        
     
        double totalHargaKuePesanan = 0; 
        int totalBeratKuePesanan = 0;
        for (Kue kue : listKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.getHarga(); 
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total harga kue pesanan: " + totalHargaKuePesanan);
        System.out.println("Total berat kue pesanan: " + totalBeratKuePesanan);
        
       
        int totalHargaKueJadi = 0;
        int totalJumlahKueJadi = 0;
        for (Kue kue : listKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.getHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total harga kue jadi: " + totalHargaKueJadi);
        System.out.println("Total jumlah kue jadi: " + totalJumlahKueJadi);
        

        Kue kueTermahal = cekHargaTertinggi();
        System.out.println("\nInformasi Kue dengan Harga Tertinggi:");
        System.out.println(kueTermahal);
    }
    
 
    static int hitungTotalHargaSemuaKue() {
        int totalHarga = 0;
        for (Kue kue : listKue) {
            totalHarga += kue.getHarga();
        }
        return totalHarga;
    }
    
   
    static Kue cekHargaTertinggi() {
        Kue kueTermahal = null;
        double hargaTerbesar = 0; 
    
        for (Kue kue : listKue) {
            double hargaKue = kue.getHarga(); 
            
            if (hargaKue > hargaTerbesar) {
                hargaTerbesar = hargaKue;
                kueTermahal = kue;
            }
        }
        return kueTermahal;
    }
    
    

    static void inisialisasiKue() {
        listKue[0] = new KueJadi("Brownies", 2000, 1);
        listKue[1] = new KueJadi("Red Velvet", 3600, 1);
        listKue[2] = new KueJadi("Chocolate Cake", 5000, 2);
        listKue[3] = new KueJadi("Cheesecake", 4200, 1);
        listKue[4] = new KueJadi("Carrot Cake", 3800, 1);
        listKue[5] = new KueJadi("Tiramisu", 4500, 1);
        listKue[6] = new KueJadi("Black Forest", 4000, 2);
        listKue[7] = new KueJadi("Strawberry Shortcake", 4800, 1);
        listKue[8] = new KueJadi("Blueberry Muffin", 3200, 1);
        listKue[9] = new KueJadi("Lemon Pound Cake", 3500, 2);
        listKue[10] = new KuePesanan("Coffee Cake", 3800, 100); 
        listKue[11] = new KuePesanan("Banana Bread", 3000, 100); 
        listKue[12] = new KuePesanan("Apple Pie", 4200, 100); 
        listKue[13] = new KuePesanan("Cinnamon Roll", 2800, 100);
        listKue[14] = new KuePesanan("Croissant", 2500, 100); 
        listKue[15] = new KuePesanan("Danish Pastry", 3000, 100);
        listKue[16] = new KuePesanan("Eclair", 3200, 100);
        listKue[17] = new KuePesanan("Fruit Tart", 4500, 100);
        listKue[18] = new KuePesanan("Honey Cake", 4000, 100);
        listKue[19] = new KuePesanan("Mousse Cake", 4800, 100);  
    }
}
