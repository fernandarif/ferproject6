package zakat.java;

public class Penerima {
    private String namaPenerima;
    private String kategoriPenerima;

    // Konstruktor berparameter
    public Penerima(String namaPenerima, String kategoriPenerima) {
        this.namaPenerima = namaPenerima;
        this.kategoriPenerima = kategoriPenerima;
    }

    // Getter dan Setter
    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public String getKategoriPenerima() {
        return kategoriPenerima;
    }

    public void setKategoriPenerima(String kategoriPenerima) {
        this.kategoriPenerima = kategoriPenerima;
    }

    // Metode untuk menampilkan informasi penerima zakat
    public void infoPenerima() {
        System.out.println("Penerima zakat: " + this.namaPenerima + ", Kategori: " + this.kategoriPenerima);
    }
}
