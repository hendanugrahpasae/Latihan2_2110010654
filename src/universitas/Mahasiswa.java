package universitas;

public class Mahasiswa {
    init__(mhs, npm, nama, prodi):
        mhs.npm = npm
        mhs.nama = nama
        mhs.prodi = prodi
    
    get_detail(self):
        detail = "NPM: {}\Nama: {}\nProdi: {}".format(mhs.npm, mhs.nama, mhs.prodi)
        return detail
}

