package linkedlist;

import java.util.Scanner;

public class MainLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int pilih;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode Buku: ");
                    String kode = sc.nextLine();

                    if (kode.length() > 5) {
                        System.out.println("Kode maksimal 5 karakter!");
                        break;
                    }

                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Penulis: ");
                    String penulis = sc.nextLine();

                    list.tambah(kode, judul, penulis);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    list.hapus();
                    break;

                case 3:
                    System.out.print("Masukkan kode buku: ");
                    list.cari(sc.nextLine());
                    break;

                case 4:
                    list.tampil();
                    break;
            }

        } while (pilih != 5);

        System.out.println("Program selesai.");
    }
}