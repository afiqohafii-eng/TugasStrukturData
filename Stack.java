package kasir;

class Stack {
    Node top;

    void push(Node data) {
        Node baru = new Node(data.nama, data.total);
        baru.next = top;
        top = baru;
    }

    void tampil() {
        Node temp = top;

        if (temp == null) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        System.out.println("\nRiwayat Transaksi:");
        while (temp != null) {
            System.out.println(temp.nama + " - " + temp.total);
            temp = temp.next;
        }
    }
}