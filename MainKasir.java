package kasir;

import java.util.Scanner;

public class MainKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        Stack s = new Stack();
        int pilih;

        do {
            System.out.println("\n=== SISTEM KASIR ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Total: ");
                    int total = sc.nextInt();

                    q.enqueue(nama, total);
                    break;

                case 2:
                    Node data = q.dequeue();
                    if (data != null) {
                        System.out.println("Melayani: " + data.nama);
                        s.push(data);
                    }
                    break;

                case 3:
                    q.tampil();
                    break;

                case 4:
                    s.tampil();
                    break;
            }

        } while (pilih != 5);

        System.out.println("Program selesai.");
    }
}