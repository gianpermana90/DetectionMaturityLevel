/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hades
 */
public class ExecutionManager {
    public int saveValueHSV(){
        int result = 0;
        String query = ""
                + "INSERT INTO data_training (mode, h, s, v, brix, kategori) "
                + "VALUES ("
                + "'Kupas'" + ","
                + 2 + ","
                + 5 + ","
                + 4 + ","
                + 29 + ","
                + "'Tidak Tahu'"
                + ")";
        ConnectionManager cm = new ConnectionManager();
        Connection con = cm.logOn();
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        cm.logOff();
        return result;
    }
}
