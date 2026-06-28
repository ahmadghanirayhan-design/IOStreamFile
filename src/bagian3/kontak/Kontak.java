package bagian3.kontak;

import java.io.Serializable;

public class Kontak implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nama;
    private String nomorTelepon;

    public Kontak(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + " | Telepon: " + nomorTelepon;
    }
}