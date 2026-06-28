package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[] args) {
        
        // ============================================================
        // 1. KODE UTAMA MODUL (Belajar Try-Catch)
        // ============================================================
        System.out.println("=== KODE UTAMA LATIHAN 2 ===");
        File berkas = new File("data.txt");
        try {
            if (berkas.createNewFile()) {
                System.out.println("Berkas baru dibuat.");
            } else {
                System.out.println("Berkas sudah ada sebelumnya.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // ============================================================
        // 2. KODE JAWABAN LATIHAN MANDIRI 1.4 (Sesuai Aturan Dosen)
        // ============================================================
        System.out.println("\n-------------------------------------------");
        System.out.println("KODE JAWABAN LATIHAN MANDIRI 1.4 (DIPADUKAN)");
        System.out.println("-------------------------------------------");

        // Soal Mandiri No 1: Memeriksa laporan.txt dan ukurannya
        File berkasLaporan = new File("laporan.txt");
        if (berkasLaporan.exists()) {
            System.out.println("Berkas ada, ukuran: " + berkasLaporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
        
        // Soal Mandiri No 2: Membuat folder baru bernama 'arsip'
        File folderArsip = new File("arsip");
        if (folderArsip.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Folder 'arsip' gagal dibuat atau sudah ada.");
        }
        
        // Soal Mandiri No 3: Membuat lalu menghapus sementara.txt
        File berkasSementara = new File("sementara.txt");
        try {
            berkasSementara.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + berkasSementara.exists());
            
            berkasSementara.delete();
            System.out.println("Sesudah dihapus, ada? " + berkasSementara.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}