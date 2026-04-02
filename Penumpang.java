class Penumpang extends Pengguna {
    private int id;

    public Penumpang(int id, String nama) {
        super(nama);
        this.id = id;
    }

    @Override
    void login() {
        System.out.println("Penumpang " + nama + " login");
    }
}