class Admin extends Pengguna {

    public Admin(String nama) {
        super(nama);
    }

    @Override
    void login() {
        System.out.println("Admin " + nama + " login");
    }
}