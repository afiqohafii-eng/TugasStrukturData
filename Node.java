package linkedlist;

class Node {
    String kode, judul, penulis;
    Node next;

    Node(String kode, String judul, String penulis) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }
}