package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    // Method keBaris() untuk mengubah data menjadi format satu baris teks (dipisah koma)
    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    // Method info() untuk menampilkan keterangan barang
    public void info() {
        System.out.println("Nama Barang: " + nama + " | Harga: Rp" + harga + " | Stok: " + stok);
    }
}