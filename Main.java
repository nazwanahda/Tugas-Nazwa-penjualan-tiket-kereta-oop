public class Main {
    public static void main(String[] args) {

        System.out.println("=== LOGIN ===");
        Penumpang p = new Penumpang(1, "Nazwa");
        Admin a = new Admin("Admin1");

        p.login();
        a.login();

        System.out.println();

        System.out.println("=== DATA KERETA ===");
        Kereta k = new Kereta("Argo Bromo", "Jakarta - Surabaya");
        k.infoKereta();

        System.out.println();

        System.out.println("=== TIKET ===");
        Tiket t = new Tiket();
        t.setHarga(150000);
        System.out.println("Harga tiket: " + t.getHarga());

        System.out.println();

        System.out.println("=== PEMBAYARAN ===");
        Pembayaran pb = new EWallet();
        pb.prosesBayar();
    }
}