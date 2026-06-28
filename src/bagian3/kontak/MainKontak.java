package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        
        // ============================================================
        // KODE UTAMA MODUL (Sesuai Gambar Modul Halaman Bagian 3)
        // ============================================================
        System.out.println("=== KODE UTAMA MODUL BAGIAN 3 ===");
        
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111"));
        buku.tambahKontak(new Kontak("Budi", "0822222"));
        buku.tambahKontak(new Kontak("Citra", "0833333"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        
        System.out.println();
        
        // Objek baru untuk memuat kembali data dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());

        // ============================================================
        // KODE JAWABAN LATIHAN MANDIRI BAGIAN 3
        // ============================================================
        System.out.println("\n-------------------------------------------");
        System.out.println("KODE JAWABAN LATIHAN MANDIRI BAGIAN 3");
        System.out.println("-------------------------------------------");
        System.out.println("-> Tugas Mandiri: Verifikasi Eksistensi & Manipulasi Objek");
        
        bukuLain.tambahKontak(new Kontak("Bunda Dara", "089876543210"));
        System.out.println("   Setelah diverifikasi dan ditambahkan data mandiri:");
        bukuLain.tampilkanSemua();
        System.out.println("   Total akhir keseluruhan kontak: " + bukuLain.jumlahKontak() + " data.");
    }
}