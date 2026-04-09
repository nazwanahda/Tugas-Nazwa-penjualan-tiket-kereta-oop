public class Penumpang {

    private int id;
    private String nama;

    public Penumpang(int id, String nama) {

        this.id = id;
        this.nama = nama;
    }

    public void login() {

        System.out.println("Penumpang " + nama + " berhasil login");
    }
}
