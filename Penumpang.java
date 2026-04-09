<<<<<<< HEAD
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
=======
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
>>>>>>> 814391c729f1673335106a57c7ed231e6a56165b
