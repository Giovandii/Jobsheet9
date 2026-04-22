package LatihanPraktikum;
import java.util.Scanner;

public class suratDemo14 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stacksurat14 stack = new stacksurat14(5);

        int pilih;

        do {
            System.out.println("\nPilihan Menu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                    scan.nextLine(); // buang enter

                    System.out.print("Nama: ");
                    String nama = scan.nextLine();

                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.next().charAt(0);

                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();

                    Surat14 srt = new Surat14(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil diajukan\n", srt.namaMahasiswa);
                    break;

                case 2:
                    Surat14 divalidasi = stack.pop();
                    if (divalidasi != null) {
                        scan.nextLine();

                        System.out.println("Memproses surat dari " + divalidasi.namaMahasiswa);
                        System.out.print("Validasi surat? (Y/T): ");
                        char konfirmasi = scan.next().charAt(0);

                        divalidasi.setStatus(konfirmasi);

                            if (konfirmasi == 'Y' || konfirmasi == 'y') {
                                System.out.printf("Surat atas nama %s DISETUJUI\n", divalidasi.namaMahasiswa);
                            } else {
                                System.out.printf("Surat atas nama %s DITOLAK\n", divalidasi.namaMahasiswa);
                            }
                        }
                    break;

                case 3:
                    Surat14 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir yang dikumpulkan oleh "+lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    scan.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cariNama = scan.nextLine();

                    Surat14 hasil = stack.cariNama(cariNama);

                    if (hasil != null) {
                        System.out.println("\nData Surat Ditemukan:");
                        System.out.println("ID Surat : " + hasil.idSurat);
                        System.out.println("Nama     : " + hasil.namaMahasiswa);
                        System.out.println("Kelas    : " + hasil.Kelas);
                        System.out.println("Jenis    : " + hasil.jenisIzin);
                        System.out.println("Durasi   : " + hasil.durasi + " hari");

                    } else {
                        System.out.println("Surat tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Keluar program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);
    }
}