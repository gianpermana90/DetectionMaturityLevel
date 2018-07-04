/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Angga-PC
 */
public class ConnectionManager {

    private Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/svm_knn"; //myDB --> nama database
    private String username = "root";   //username DBMS
    private String password = "4426896";   //pwd DBMS

    public Connection logOn() {
        try {
            //load JDBC Driver
            Class.forName(driver).newInstance();
            //buat objek connection
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public void logOff() {
        try {
            //tutup koneksi
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
