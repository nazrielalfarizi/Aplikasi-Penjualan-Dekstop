package penjualan.entity;

import java.util.Date;
/**
 *
 * @author Fadillah F
 */
public class transaksi {
    private String noFaktur;
    private String id_pelanggan;
    private String tanggal_penjualan;
    
    public String getNoFaktur() {
        return noFaktur;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    public String getIdPelanggan() {
        return id_pelanggan;
    }

    public void setIdPelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getTglPenjualan() {
        return tanggal_penjualan;
    }

    public void setTglPenjualan(String tanggal_penjualan) {
        this.tanggal_penjualan = tanggal_penjualan;
    }   
}
