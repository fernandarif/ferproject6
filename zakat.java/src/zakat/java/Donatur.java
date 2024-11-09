package zakat.java;

public class Donatur {
    private String nama;
    private double jumlahHarta;

    // Konstruktor berparameter
    public Donatur(String nama, double jumlahHarta) {
        this.nama = nama;
        this.jumlahHarta = jumlahHarta;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getJumlahHarta() {
        return jumlahHarta;
    }

    public void setJumlahHarta(double jumlahHarta) {
        this.jumlahHarta = jumlahHarta;
    }

    // Metode untuk menghitung zakat berdasarkan jenis harta
    public double hitungZakat(double persentaseZakat) {
        return this.jumlahHarta * persentaseZakat / 100;
    }
}
