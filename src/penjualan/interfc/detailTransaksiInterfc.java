/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.interfc;

import java.sql.SQLException;
import java.util.List;
import penjualan.entity.detailTransaksi;

/**
 *
 * @author Fadillah F
 */
public interface detailTransaksiInterfc {
    detailTransaksi insert (detailTransaksi o) throws SQLException;
}
