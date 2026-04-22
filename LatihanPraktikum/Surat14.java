package LatihanPraktikum;
public class Surat14 {
    
    String idSurat;
    String namaMahasiswa;
    String Kelas;
    char jenisIzin;
    int durasi;
    char status;

    public Surat14(){}

    public Surat14 (String idSurat, String namaMahasiswa, String Kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.Kelas = Kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        this.status = '-'; // default
    }

    void Lamadurasi(int durasi){
        this.durasi = durasi;
    }

    void setStatus(char status){
        this.status = status;
    }

}