package penjualan.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging. Level;
import java.util.logging.Logger;

/**
 *
 */
public class koneksi {
    
    private static Connection conn;
    public static Connection getConnection() {
        if (conn == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
                conn = DriverManager
                        .getConnection("jdbc:mysql://localhost/db_stefhanie_valentina_xii_rpl1_penjualan","root","");
            } catch (SQLException ex) {
                Logger.getLogger(penjualan.koneksi.koneksi.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
}

