package penjualan.entity;

public class pelanggan {
    private int id_pelanggan;
    private String nama;
    private String jenisKel;
    private String alamat;
    private String notlp;
    private String idpel = String.valueOf(id_pelanggan);

    public String getIdPelanggan() {
        return idpel;
    }
    public void setIdPelanggan(String idpel) {
        this.idpel = idpel;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenisKel() {
        return jenisKel;
    }
    public void setJenisKel(String jenisKel) {
        this.jenisKel = jenisKel;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNotlp() {
        return notlp;
    }
    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }
}
