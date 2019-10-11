/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hodam
 */
public class TaxRate {
    
    Connection con  ;
    ResultSet rs;
    Statement stmt ;
    
    public TaxRate() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tax_rate" , "root", "root");
        
        stmt = con.createStatement();
    }
    
    public double getV(String tableName , double A) throws SQLException{
        String SQL = "Select * from " + tableName ;
        rs = stmt.executeQuery(SQL);
        while(rs.next()){
            if(A <= 0)
                return -1 ;
            if(A < rs.getDouble("base")){
                rs.previous();
                return rs.getDouble("v");
            }
        }
        rs.previous();
        return rs.getDouble("v");
    }
    
    public double getKP(String tableName , double v) throws SQLException{
        String SQL = "Select * from " + tableName +" where v = " + v;
        rs = stmt.executeQuery(SQL);
        
        rs.next();        
        return rs.getDouble("kp");
        
    }
    
    public static void main(String[] args) {
        try {
            TaxRate a = new TaxRate();
            
            System.out.println(a.getV("alberta" , 1));
            System.out.println(a.getKP("alberta" , a.getV("alberta" , 180000 )));
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClaimCode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClaimCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
