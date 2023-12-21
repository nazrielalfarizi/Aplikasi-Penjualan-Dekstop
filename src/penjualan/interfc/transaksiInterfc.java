/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.interfc;

import java.sql.SQLException;
import penjualan.entity.transaksi;

/**
 *
 * @author 
 */
public interface transaksiInterfc {
    transaksi insert (transaksi o) throws SQLException;
}
