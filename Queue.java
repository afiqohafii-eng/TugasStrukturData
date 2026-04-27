package kasir;

class Queue {
    Node front, rear;
    int jumlah = 0;

    void enqueue(String nama, int total) {
        if (jumlah >= 5) {
            System.out.println("Antrian penuh (maksimal 5)!");
            return;
        }

        Node baru = new Node(nama, total);

        if (rear == null) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        jumlah++;
        System.out.println("Pelanggan masuk antrian.");
    }

    Node dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return null;
        }

        Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        jumlah--;
        return temp;
    }

    void tampil() {
        Node temp = front;

        if (temp == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("\nAntrian:");
        while (temp != null) {
            System.out.println(temp.nama + " - " + temp.total);
            temp = temp.next;
        }
    }
}