package penjualan.implement;

import penjualan.entity.pelanggan;
import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.interfc.pelangganInterfc;
/**
 *
 */
public class pelangganImplement implements pelangganInterfc {
    public pelanggan insert(pelanggan o) throws SQLException{
        PreparedStatement st=koneksi
                .getConnection()
                .prepareStatement("insert into pelanggan values (?,?,?,?,?)");
        st.setString(1,o.getIdPelanggan());
        st.setString (2,o.getNama ());
        st.setString(3,o.getJenisKel());
        st.setString(4,o.getAlamat());
        st.setString(5,o.getNotlp());
        st.executeUpdate();
        return o;
    }
    
    public void update (pelanggan o) throws SQLException {
        PreparedStatement st=koneksi
                .getConnection()
                .prepareStatement("update pelanggan set "
                        + "nama=?, "
                        + "jk=?, "
                        + "alamat=?, "
                        + "notlp=? "
                        + "where id_pelanggan=?");
        st.setString(1, o.getNama());
        st.setString (2, o.getJenisKel());
        st.setString(3, o.getAlamat());
        st.setString(4, o.getNotlp());
        st.setString(5, o.getIdPelanggan());
        st.executeUpdate();
    }
    //-----untuk delete data berdasarkan kode_barang-
    public void delete (String id_pelanggan) throws SQLException {
        PreparedStatement st=koneksi.getConnection().prepareStatement
        ("delete from pelanggan where id_pelanggan = ?");
        st.setString(1, id_pelanggan);
        st.executeUpdate();
    }
    public List<pelanggan> getAll() throws SQLException{
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from pelanggan");
        List<pelanggan>list=new ArrayList<pelanggan>();
        while(rs.next()) {
            pelanggan plg = new pelanggan();
            plg.setIdPelanggan(rs.getString("id_pelanggan"));
            plg.setNama (rs.getString("nama"));
            plg.setJenisKel (rs.getString("jk"));
            plg.setAlamat (rs.getString("alamat"));
            plg.setNotlp (rs.getString("notlp"));
            list.add (plg);
        }
        return list;
    }

}