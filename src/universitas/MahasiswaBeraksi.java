package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("", "", "");
        String detail = mahasiswa.getDetail();
        System.out.println(detail);
    }
}    