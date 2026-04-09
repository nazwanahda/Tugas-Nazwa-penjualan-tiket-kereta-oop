<<<<<<< HEAD
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
=======
class Kereta {
    String namaKereta;
    String rute;

    public Kereta(String namaKereta, String rute) {
        this.namaKereta = namaKereta;
        this.rute = rute;
    }

    void infoKereta() {
        System.out.println("Kereta: " + namaKereta + " | Rute: " + rute);
    }
}
>>>>>>> 814391c729f1673335106a57c7ed231e6a56165b
