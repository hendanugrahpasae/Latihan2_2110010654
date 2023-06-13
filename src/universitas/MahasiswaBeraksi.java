package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa hend = new Mahasiswa("2110010654", "Hend Anugrah Pasae.I.M", "Teknik Informatika");
        String detail = hend.getDetail();
        System.out.println(detail);

    }
}    