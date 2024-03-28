
class Akun {
   
    private int saldo;
    private final int jenisRekening;

    public Akun( int jenisRekening) {
        
        this.jenisRekening = jenisRekening;
        this.saldo = 10000; // Saldo awal 10.000
    }



    public int getJenisRekening() {
        return jenisRekening;
    }

    public int getSaldo() {
        return saldo;
    }


    public void tambahSaldo(int jumlah) {
        saldo += jumlah;
    }

    
    public void kurangiSaldo(int jumlah) {
        saldo -= jumlah;
    }

    
    public String getJenisRekeningString() {
        switch (jenisRekening) {
            case 38:
                return "Silver";
            case 56:
                return "Gold";
            case 74:
                return "Platinum";
            default:
                return "Tidak diketahui";
        }
    }

    
    public int hitungCashback(int hargaPembelian) {
        int cashback;
        if (hargaPembelian > 1000000) {
            switch (jenisRekening) {
                case 38:
                    cashback = (int) (hargaPembelian * 0.05);
                    break;
                case 56:
                    cashback = (int) (hargaPembelian * 0.07);
                    break;
                case 74:
                    cashback = (int) (hargaPembelian * 0.10);
                    break;
                default:
                    cashback = 0;
            }
        } else {
            switch (jenisRekening) {
                case 56:
                    cashback = (int) (hargaPembelian * 0.02);
                    break;
                case 74:
                    cashback = (int) (hargaPembelian * 0.05);
                    break;
                default:
                    cashback = 0;
            }
        }
        return cashback;
    }
}
