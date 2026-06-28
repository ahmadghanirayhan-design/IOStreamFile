package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Latihan5 {
    public static void main(String[] args) {
        
        // ============================================================
        // KODE UTAMA LATIHAN 5: APPEND MAHASISWA (Halaman 6)
        // ============================================================
        System.out.println("=== KODE UTAMA LATIHAN 5 (APPEND) ===");
        // Parameter 'true' pada FileWriter artinya menambahkan data tanpa menimpa data lama
        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt", true))) {
            penulis.println("Dewi");
            penulis.println("Eka");
            System.out.println("Dua nama baru (Dewi & Eka) berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        // ============================================================
        // KODE JAWABAN LATIHAN MANDIRI 2.4 (DIPADUKAN)
        // ============================================================
        System.out.println("\n-------------------------------------------");
        System.out.println("KODE JAWABAN LATIHAN MANDIRI 2.4 (DIPADUKAN)");
        System.out.println("-------------------------------------------");

        // Soal Mandiri No 1: Menulis 5 hari awal ke hari.txt lalu membaca isinya
        System.out.println("-> Tugas 1: Menulis & Membaca 5 Hari Awal");
        String[] hariAwal = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        // Proses Menulis 5 Hari
        try (PrintWriter penulisHari = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hariAwal) {
                penulisHari.println(h);
            }
        } catch (IOException e) {
            System.out.println("Gagal menulis hari: " + e.getMessage());
        }
        
        // Proses Membaca 5 Hari
        try (BufferedReader pembacaHari = new BufferedReader(new FileReader("hari.txt"))) {
            String barisHari;
            while ((barisHari = pembacaHari.readLine()) != null) {
                System.out.println("   " + barisHari);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca hari: " + e.getMessage());
        }

        // Soal Mandiri No 2: Append (menambah) 2 hari akhir pekan tanpa menghapus isi lama
        System.out.println("\n-> Tugas 2: Menambahkan 2 Hari Akhir Pekan (Append)");
        try (PrintWriter penulisAppendHari = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulisAppendHari.println("Sabtu");
            penulisAppendHari.println("Minggu");
            System.out.println("   Sabtu & Minggu berhasil ditambahkan!");
        } catch (IOException e) {
            System.out.println("Gagal append hari: " + e.getMessage());
        }

        // Soal Mandiri No 3: Menghitung total seluruh baris yang ada di hari.txt
        System.out.println("\n-> Tugas 3: Menghitung Total Seluruh Baris di hari.txt");
        int totalBaris = 0;
        try (BufferedReader hitungPembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (hitungPembaca.readLine() != null) {
                totalBaris++;
            }
            System.out.println("   Total keseluruhan baris di hari.txt = " + totalBaris + " baris.");
        } catch (IOException e) {
            System.out.println("Gagal menghitung baris berkas: " + e.getMessage());
        }
    }
}