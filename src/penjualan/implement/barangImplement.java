package penjualan.implement;
/**
 * 
 */
import penjualan.entity.barang;
import penjualan.interfc.barangInterfc;
import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.interfc.barangInterfc;

public class barangImplement implements barangInterfc {
    //----untuk insert ke database-
    public barang insert (barang o) throws SQLException {
        PreparedStatement st=koneksi
                .getConnection()
                .prepareStatement("insert into barang values (?,?,?,?)");
        st.setString(1, o.getKodeBarang());
        st.setString (2, o.getNamaBarang());
        st.setString(3, o.getHarga() + " ");
         st.setString(4, o.getJumlah () + " ");
        st.executeUpdate();
        return o;
    }
    //------untuk update ke database-
    public void update (barang o) throws SQLException {
        PreparedStatement st=koneksi
                .getConnection()
                .prepareStatement("update barang set "
                        + "nama_barang=?, "
                        + "stok_barang=?, "
                        + "harga_barang=? "
                        + "where kode_barang=?");
        st.setString(1, o.getNamaBarang());
        st.setString (2, o.getJumlah());
        st.setString(3, o.getHarga());
        st.setString(4, o.getKodeBarang());
        st.executeUpdate();
    }
    //------untuk delete data berdasarkan kode_barang-
    public void delete (String kode_barang) throws SQLException {
        PreparedStatement st=koneksi
                .getConnection()
                .prepareStatement("delete from barang where kode_barang=?");
        st.setString(1, kode_barang);
        st.executeUpdate();
    }
    //---untuk select atau view databarang dari DB ke forn
    public List<barang> getAll() throws SQLException {
        Statement st=koneksi.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from barang");
        List<barang>list=new ArrayList<barang>();
        while (rs.next()) {
            barang brg=new barang();
            brg.setKodeBarang (rs.getString("kode_barang"));
            brg.setNamaBarang (rs.getString("nama_barang"));
            brg.setHarga (rs.getString("harga_barang"));
            brg.setJumlah (rs.getString("stok_barang"));
            list.add(brg);
        }
        return list;
    }
}