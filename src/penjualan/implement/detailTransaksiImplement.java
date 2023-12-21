package penjualan.implement;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import penjualan.entity.detailTransaksi;
import penjualan.interfc.detailTransaksiInterfc;
import penjualan.koneksi.koneksi;

/**
 *
 * 
 */
public class detailTransaksiImplement implements detailTransaksiInterfc {
    @Override
    public detailTransaksi insert(detailTransaksi o) throws SQLException {
        PreparedStatement st = koneksi
                .getConnection()
                .prepareStatement("insert into detiljual ("
                        + "no_faktur, "
                        + "kode_barang, "
                        + "jumlah, "
                        + "subtotal) "
                        + "values(?,?,?,?)");
        st.setString(1, o.getNoFaktur());
        st.setString(2, o.getKodeBarang());
        st.setInt(3, o.getJumlah());        
        st.setString(4, o.getSubTotal());

        st.executeUpdate();
        return o;   
    }
}
