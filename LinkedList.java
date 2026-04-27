package linkedlist;

class LinkedList {
    Node head;

    // tambah data di akhir
    void tambah(String kode, String judul, String penulis) {
        Node baru = new Node(kode, judul, penulis);

        if (head == null) {
            head = baru;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
    }

    // hapus data terakhir
    void hapus() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Data terakhir berhasil dihapus.");
    }

    // cari data
    void cari(String kode) {
        Node temp = head;
        while (temp != null) {
            if (temp.kode.equals(kode)) {
                System.out.println("Ditemukan:");
                System.out.println("Kode: " + temp.kode);
                System.out.println("Judul: " + temp.judul);
                System.out.println("Penulis: " + temp.penulis);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // tampil semua
    void tampil() {
        Node temp = head;
        int jumlah = 0;

        if (temp == null) {
            System.out.println("Data kosong.");
            return;
        }

        System.out.println("\nDaftar Buku:");
        while (temp != null) {
            System.out.println("Kode: " + temp.kode +
                    " | Judul: " + temp.judul +
                    " | Penulis: " + temp.penulis);
            temp = temp.next;
            jumlah++;
        }

        System.out.println("Total Buku: " + jumlah);
    }
}