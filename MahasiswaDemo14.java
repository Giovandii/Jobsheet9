import java.util.Scanner;
public class MahasiswaDemo14 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);

        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Paling Bawah");
            System.out.println("6. Jumlah Tugas yang Dikumpulkan");
            System.out.print("Piilih: ");
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa14 mhs = new Mahasiswa14(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                
                case 2:
                    Mahasiswa14 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai data dari "+ dinilai.nama);
                        System.out.print("Masukan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa14 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir yang dikumpulkan oleh "+lihat.nama);
                    }
                    break;

                case 4:
    
                    System.out.println("daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa14 bawah = stack.peekBawah();
                    if (bawah != null) {
                        System.out.println("Tugas Pertama kali dikumpulkan oleh "+bawah.nama);
                    }
                    break;

                case 6:
                    int jumlah = stack.jumtugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: "+jumlah);
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    
            }
        } while (pilih >= 1 && pilih <=6);
    }
}