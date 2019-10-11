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

public class ClaimCode {

    Connection con;
    ResultSet rs;
    Statement stmt;

    public ClaimCode() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/claim_code", "root", "root");

        stmt = con.createStatement();

    }

    public double getK1(String tableName, int cc) throws SQLException {

        String SQL = "Select * from " + tableName + " where code = " + cc;
        rs = stmt.executeQuery(SQL);

        rs.next();

        return rs.getDouble("k1");
    }
    
    public String searchCC(int cc , String tableName) throws SQLException{
        String out = "";
        String SQL = "Select * from " + tableName + " where code = " + cc ;
        rs = stmt.executeQuery(SQL);
        rs.next() ;
        out += rs.getString("totalclaimStart") + " - " + rs.getString("totalclaimEnd") + " Claim Code ("+cc+")";
        
        return out ;
    }
    public static void main(String[] args) {
        try {
            ClaimCode a = new ClaimCode();
            
            System.out.println(a.getK1("alberta" , 44000));
            
           
        

} catch (ClassNotFoundException ex) {
            Logger.getLogger(ClaimCode.class
.getName()).log(Level.SEVERE, null, ex);
        

} catch (SQLException ex) {
            Logger.getLogger(ClaimCode.class
.getName()).log(Level.SEVERE, null, ex);
        }
    }




}
