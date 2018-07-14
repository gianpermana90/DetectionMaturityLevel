/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import cls.mangga;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hades
 */
public class ExecutionManager {
    public int saveValueHSV(mangga m){
        int result = 0;
        String query = ""
                + "INSERT INTO data_training (mode, h, s, v, brix, kategori) "
                + "VALUES ("
                + "'"+m.getMode()+"'" + ","
                + m.getH() + ","
                + m.getS() + ","
                + m.getV() + ","
                + 0 + ","
                + "'"+m.getKategori()+"'"
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
    
    public int getLastID(){
        int result = 0;
        ConnectionManager cm = new ConnectionManager();
        Connection con = cm.logOn();
        String query = "SELECT id FROM data_training";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            if(rs.next()){
                result = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
