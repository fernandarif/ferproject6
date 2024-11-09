 package zakat.java;

import java.util.Scanner;

public class ZakatJava{
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;
        
        System.out.println("================================");
        System.out.println("  UNIVERSITAS MUHAMMADIYAH PONOROGO       ");
        System.out.println("            FERNANDA RIFKY SYAHRIAL                            ");
        System.out.println("                 TEKNIK INFORMATIKA                                  ");
        System.out.println("================================");
        System.out.println("");

        // Pengulangan program
        while (ulangi) {
            System.out.println("================================");
            System.out.println("Pilih Jenis Harta Yang Anda Ingin zakatkan:");
            System.out.println("1. Uang");
            System.out.println("2. Emas");
            System.out.println("3. Perak");
            System.out.println("4. Ternak");
            System.out.println("================================");
            System.out.println("");
            System.out.print("Masukkan pilihan Anda (1/2/3/4) : ");
            String pilihanHarta = input.nextLine();

            try {
                switch (pilihanHarta) {
                    case "1": // Zakat Uang
                        System.out.println("_______________________________________________________________");
                        System.out.print("Masukkan jumlah uang Anda (Bebas) : ");
                        double uang = Double.parseDouble(input.nextLine());
                        double zakatUang = uang * 2.5 / 100;
                        System.out.println("Zakat uang yang harus dibayarkan : Rp." + zakatUang);
                        System.out.println("_______________________________________________________________");
                        break;
                        

                    case "2": // Zakat Emas
                        System.out.println("___________________________________________________________________________");
                        System.out.print("Masukkan jumlah emas dalam gram (85 Gram Atau Lebih): ");
                        double emas = Double.parseDouble(input.nextLine());
                        if (emas >= 85) {
                            double zakatEmas = emas * 2.5 / 100;
                            System.out.println("Zakat emas yang harus dibayarkan : " + zakatEmas + " gram emas.");
                            System.out.println("___________________________________________________________________________");
                        } else {
                            System.out.println("Jumlah emas kurang dari nisab (85 gram), Maka tidak wajib untuk berzakat.");
                        }
                        break;

                    case "3": // Zakat Perak
                        System.out.println("_____________________________________________________________________________");
                        System.out.print("Masukkan jumlah perak dalam gram (595 Gram Atau Lebih) : ");
                        double perak = Double.parseDouble(input.nextLine());
                        if (perak >= 595) {
                            double zakatPerak = perak * 2.5 / 100;
                            System.out.println("Zakat perak yang harus dibayarkan : " + zakatPerak + " gram perak.");
                            System.out.println("____________________________________________________________________________");
                        } else {
                            System.out.println("Jumlah perak kurang dari nisab (595 gram), tidak wajib zakat.");
                        }
                        break;

                    case "4": // Zakat Ternak
                        System.out.println("______________________________________________________________________________");
                        System.out.print("Masukkan jumlah ternak yang Anda miliki (40 Ekor - 120 ekor) : ");
                        int ternak = Integer.parseInt(input.nextLine());
                        if (ternak >= 40) {
                            System.out.println("Maka zakat ternak 1 ekor kambing/sapi untuk setiap 40-120 ternak.");
                            System.out.println("_______________________________________________________________________________");
                        } else {
                            System.out.println("Jumlah ternak kurang dari 40, tidak wajib zakat.");
                        }
                        break;

                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih antara 1, 2, 3, atau 4.");
                        continue;
                }
            } catch (NumberFormatException b) {
                // Menghapus pesan kesalahan pada bagian catch
                System.out.println("Input tidak valid, harap masukkan angka yang sesuai.");
                continue; // Kembali ke awal loop jika input salah
            }

            // Memberikan pilihan kepada pengguna apakah ingin mengulangi atau tidak
            System.out.print("Apakah Anda Ingin Berzakat lagi? (y lanjut/t tidak): ");
            String pilihan = input.nextLine().toLowerCase();

            // Menangani pilihan akhir, jika input bukan "y" atau "t", maka error
            if (pilihan.equals("t")) {
                ulangi = false; // Menghentikan pengulangan
                System.out.println("!!Terimakasih Telah Berzakat, Semoga Diberi Kelancaran Untuk Berzakat DIlain Waktu");
            } else if (pilihan.equals("y")) {
                // Lanjutkan pengulangan
                continue;
            } else {
                // Jika input bukan "y" atau "t", tampilkan pesan error
                System.out.println("Input tidak valid. Harap masukkan 'y' untuk lanjut atau 't' untuk keluar.");
                break; // Hentikan program jika input salah
            }
        }
    }
}
