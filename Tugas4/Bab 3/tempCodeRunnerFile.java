    public lingkaran(String alas, String tinggi) {
        convertStringtoInt(alas, tinggi);
    }
    
    private void convertStringtoInt(String alas, String tinggi) {
        this.alas = Integer.parseInt(alas);
        this.tinggi = Integer.parseInt(tinggi);