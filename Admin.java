public class Admin {

    private String namaAdmin;

    public Admin(String namaAdmin) {

        this.namaAdmin = namaAdmin;
    }

    public void login() {

        System.out.println("Admin " + namaAdmin + " berhasil login");
    }
}
