// Nama: Rayhan Ahmad Ghani
// NPM: 2410010270

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // 1. Menyimpan daftar nama kategori dalam sebuah array String (minimal 3, ukuran tetap) dan menampilkannya
        System.out.println("=== REQUIREMENT 1: ARRAY KATEGORI BARANG ===");
        String[] kategori = {"Elektronik Toko", "Pakaian & Atribut", "Bahan Sembako", "Alat Tulis Kantor"};
        for (int i = 0; i < kategori.length; i++) {
            System.out.println("Kategori [" + i + "]: " + kategori[i]);
        }
        System.out.println();

        // 2. Membuat objek Gudang awal dan mengisi minimal 5 objek Barang
        System.out.println("=== REQUIREMENT 2: INPUT & SIMPAN 5 BARANG AWAL ===");
        Gudang gudangUtama = new Gudang();
        gudangUtama.tambahBarang(new Barang("Laptop ASUS", 12500000, 4));
        gudangUtama.tambahBarang(new Barang("iPhone 13 Pro", 14000000, 3));
        gudangUtama.tambahBarang(new Barang("Kemeja Erigo", 185000, 20));
        gudangUtama.tambahBarang(new Barang("Susu Kotak Kardus", 115000, 10));
        gudangUtama.tambahBarang(new Barang("Buku Catatan Premium", 35000, 50));

        System.out.println("Menampilkan data di gudang utama:");
        gudangUtama.tampilkanSemua();
        
        // Menyimpan data ke berkas barang.txt (satu barang per baris)
        gudangUtama.simpanKeBerkas("barang.txt");
        System.out.println();

        // 3. Membuat objek Gudang baru, memuat kembali data dari berkas, dan menampilkan total nilai persediaan
        System.out.println("=== REQUIREMENT 3: MEMUAT BERKAS DI OBJEK GUDANG BARU ===");
        Gudang gudangBaru = new Gudang();
        gudangBaru.muatDariBerkas("barang.txt");
        
        System.out.println("Menampilkan data dari objek gudang baru:");
        gudangBaru.tampilkanSemua();
        
        // Pembuktian total nilai persediaan (harga dikali stok seluruh barang)
        System.out.println("\nTotal Nilai Persediaan Seluruh Barang: Rp" + gudangBaru.totalNilai());
        System.out.println("BUILD SUCCESSFUL - SIAP DIKUMPUL!");
    }
}