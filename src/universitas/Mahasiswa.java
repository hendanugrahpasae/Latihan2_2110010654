package universitas;

public class Mahasiswa {
    private String npm;
    private String nama;
    private String prodi;
    
    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    // Setter untuk npm
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    // Getter untuk npm
    public String getNpm() {
        return npm;
    }
    
    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Getter untuk nama
    public String getNama() {
        return nama;
    }
    
    // Setter untuk prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    // Getter untuk prodi
    public String getProdi() {
        return prodi;
    }
    
    public String getDetail() {
        return "NPM: " + npm + "\nNama: " + nama + "\nProdi: " + prodi;
    }
}
