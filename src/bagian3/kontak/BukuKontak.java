package bagian3.kontak;

import java.io.*;
import java.util.ArrayList;

public class BukuKontak {
    private String namaFile;
    private ArrayList<Kontak> daftarKontak;

    // Constructor sesuai gambar modul
    public BukuKontak(String namaFile) {
        this.namaFile = namaFile;
        this.daftarKontak = new ArrayList<>();
    }

    // Method untuk menambah objek kontak ke dalam list
    public void tambahKontak(Kontak kontak) {
        daftarKontak.add(kontak);
    }

    // Method untuk menampilkan semua kontak di console
    public void tampilkanSemua() {
        if (daftarKontak.isEmpty()) {
            System.out.println("Buku kontak kosong.");
        } else {
            for (Kontak k : daftarKontak) {
                System.out.println(k);
            }
        }
    }

    // Method Serialization: Menyimpan seluruh list objek ke berkas
    public void simpanKeBerkas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(namaFile))) {
            oos.writeObject(daftarKontak);
            System.out.println("Berhasil menyimpan data ke berkas.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    // Method Deserialization: Memuat kembali list objek dari berkas
    @SuppressWarnings("unchecked")
    public void muatDariBerkas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(namaFile))) {
            daftarKontak = (ArrayList<Kontak>) ois.readObject();
            System.out.println("Berhasil memuat data dari berkas.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal memuat data: " + e.getMessage());
        }
    }

    // Method untuk menghitung total kontak yang tersimpan
    public int jumlahKontak() {
        return daftarKontak.size();
    }
}