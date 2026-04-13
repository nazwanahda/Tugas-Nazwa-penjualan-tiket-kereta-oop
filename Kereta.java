public class Kereta {

    private String namaKereta;
    private String rute;
    private int harga;

    public Kereta(String namaKereta, String rute, int harga) {

        this.namaKereta = namaKereta;
        this.rute = rute;
        this.harga = harga;
    }

    public String getNamaKereta() {

        return namaKereta;
    }

    public String getRute() {

        return rute;
    }

    public int getHarga() {

        return harga;
    }
}
