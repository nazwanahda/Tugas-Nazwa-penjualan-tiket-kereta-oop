<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== LOGIN ===");

        Penumpang p = new Penumpang(1, "Nazwa");
        Admin a = new Admin("Admin1");

        p.login();
        a.login();

        System.out.println("\n=== DATA KERETA ===");

        // ArrayList (dynamic)
        ArrayList<Kereta> daftarKereta = new ArrayList<>();

        daftarKereta.add(new Kereta("Argo Bromo", "Jakarta - Surabaya", 150000));
        daftarKereta.add(new Kereta("Taksaka", "Jakarta - Yogyakarta", 120000));
        daftarKereta.add(new Kereta("Lodaya", "Bandung - Solo", 100000));

        // tampilkan daftar kereta
        for (int i = 0; i < daftarKereta.size(); i++) {

            System.out.println(
                    (i + 1) + ". "
                    + daftarKereta.get(i).getNamaKereta()
                    + " | "
                    + daftarKereta.get(i).getRute()
                    + " | Rp "
                    + daftarKereta.get(i).getHarga()
            );
        }

        // pilih kereta
        System.out.print("\nPilih kereta (masukkan nomor): ");
        int pilih = input.nextInt();

        Kereta keretaDipilih = daftarKereta.get(pilih - 1);

        System.out.println("\n=== TIKET ===");

        System.out.println("Kereta dipilih: "
                + keretaDipilih.getNamaKereta());

        System.out.println("Harga tiket: "
                + keretaDipilih.getHarga());

        System.out.println("\n=== PEMBAYARAN ===");

        Pembayaran pb = new EWallet();
        pb.prosesBayar();
    }
}
=======
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
>>>>>>> 814391c729f1673335106a57c7ed231e6a56165b
