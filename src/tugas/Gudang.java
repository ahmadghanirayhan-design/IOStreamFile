package tugas;

import java.io.*;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftarBarang;

    public Gudang() {
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Gudang kosong.");
        } else {
            for (Barang b : daftarBarang) {
                b.info();
            }
        }
    }

    // Menyimpan seluruh data barang ke sebuah berkas teks, satu barang per baris
    public void simpanKeBerkas(String namaFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            for (Barang b : daftarBarang) {
                writer.println(b.keBaris());
            }
            System.out.println("-> Berhasil menyimpan seluruh data barang ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan berkas: " + e.getMessage());
        }
    }

    // Memuat kembali data dari berkas teks
    public void muatDariBerkas(String namaFile) {
        daftarBarang.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                String[] data = baris.split(",");
                if (data.length == 3) {
                    String nama = data[0];
                    double harga = Double.parseDouble(data[1]);
                    int stok = Integer.parseInt(data[2]);
                    daftarBarang.add(new Barang(nama, harga, stok));
                }
            }
            System.out.println("-> Berhasil memuat data dari berkas " + namaFile);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Gagal memuat berkas: " + e.getMessage());
        }
    }

    // Menghitung totalNilai yang menjumlahkan (harga * stok) dari seluruh barang
    public double totalNilai() {
        double total = 0;
        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }
        return total;
    }
}