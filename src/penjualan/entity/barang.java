package penjualan.entity;

public class barang {
    private String kode_barang;    
    private String nama_barang;
    private int stok_barang;    
    private double harga_barang;
    
    private String jml = String.valueOf(stok_barang);
    private String hrg = String.valueOf(harga_barang);

    public String getKodeBarang() {
        return kode_barang;
    }
    public void setKodeBarang(String kode_barang) {
        this.kode_barang = kode_barang;
    }
    public String getNamaBarang() {
        return nama_barang;
    }
    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    public int getStok_barang() {
        return stok_barang;
    }
    public void setStok_barang(int stok_barang) {
        this.stok_barang = stok_barang;
    }
    public String getJumlah() {
        return jml;
    }
    public void setJumlah(String jml) {
        this.jml = jml;
    }
    public String getHarga() {
        return hrg;
    }
    public void setHarga(String hrg) {
        this.hrg = hrg;
    }
}
