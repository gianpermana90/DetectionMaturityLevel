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
import java.util.ArrayList;
import java.util.List;
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
                + m.getBrix() + ","
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
        String query = "SELECT id FROM data_training ORDER BY id";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                result = rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        cm.logOff();
        return result;
    }
    
    public List<mangga> getAllDataTraining(String mode){
        List<mangga> listMangga = new ArrayList<mangga>();
        ConnectionManager cm = new ConnectionManager();
        Connection con = cm.logOn();
        String query = "SELECT * FROM data_training WHERE mode = '"+mode+"'";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                mangga m = new mangga();
                m.setH(rs.getDouble("h"));
                m.setS(rs.getDouble("s"));
                m.setV(rs.getDouble("v"));
                m.setMode(rs.getString("mode"));
                m.setKategori(rs.getString("kategori"));
                m.setBrix(rs.getDouble("brix"));
                listMangga.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        cm.logOff();
        return listMangga;
    }
}
