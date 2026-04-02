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