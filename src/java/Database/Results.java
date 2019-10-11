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
public class Results {

    Connection con;
    ResultSet rs;
    Statement stmt;
    int i = 0;

    private String employeeName;
    private String province;
    private String federalCC;
    private String provincialCC;

    private double salary, totalIncome, taxableIncomePayPeriod, federalTax, provincialTax,
            additionalDeduct, totalTax, deductSource, cppDeduct, eiDeduct, totalDeduct, netAmount;

    public Results() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/results", "root", "root");

        stmt = con.createStatement();

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProvince() {
        return province;
    }

    public String getFederalCC() {
        return federalCC;
    }

    public String getProvincialCC() {
        return provincialCC;
    }

    public double getSalary() {
        return salary;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTaxableIncomePayPeriod() {
        return taxableIncomePayPeriod;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public double getProvincialTax() {
        return provincialTax;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getDeductSource() {
        return deductSource;
    }

    public double getCppDeduct() {
        return cppDeduct;
    }

    public double getEiDeduct() {
        return eiDeduct;
    }

    public double getTotalDeduct() {
        return totalDeduct;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public double getAdditionalDeduct() {
        return additionalDeduct;
    }

    public int getPK() throws SQLException {
        String SQL = "select id from final";
        rs = stmt.executeQuery(SQL);
        while (rs.next());
        rs.previous();

        return rs.getInt(1);

    }

    public void search() throws SQLException {
        String SQL = "select * from final where id = '" + getPK() + "'";
        rs = stmt.executeQuery(SQL);

        rs.next();

        employeeName = rs.getString(2);
        province = rs.getString(3);
        federalCC = rs.getString(4);
        provincialCC = rs.getString(5);
        salary = rs.getDouble(6);
        totalIncome = rs.getDouble(7);
        taxableIncomePayPeriod = rs.getDouble(8);
        federalTax = rs.getDouble(9);
        provincialTax = rs.getDouble(10);
        additionalDeduct = rs.getDouble(11);
        totalTax = rs.getDouble(12);
        deductSource = rs.getDouble(13);
        cppDeduct = rs.getDouble(14);
        eiDeduct = rs.getDouble(15);
        totalDeduct = rs.getDouble(16);
        netAmount = rs.getDouble(17);
    }

    public void insert(String employeeName, String province, String federalCC, String provincialCC,
            double salary, double totalIncome, double taxableIncomePayPeriod, double federalTax, double provincialTax,
            double addtionalTax, double totalTax,
            double deductSource, double cppDeduct, double eiDeduct, double totalDeduct, double netAmount) throws SQLException {

        String SQL = "insert into final (employee_name , province , federal_cc , provincial_cc , salary ,"
                + "total_income , taxable_income_pp , federal_tax , provincial_tax, add_deduct , total_tax , deduct_source, "
                + "cpp_deduct , ei_deduct , total_deduct , net_amount) values ( " + "  '" + employeeName + "' , '" + province + "' , '"
                + federalCC + "' , '" + provincialCC + "' , '" + salary + "' , '" + totalIncome + "' , '"
                + taxableIncomePayPeriod + "' , '" + federalTax + "' , '" + provincialTax + "' , '" + addtionalTax
                + "' , '" + totalTax + "' , '" + deductSource + "' , '" + cppDeduct + "' , '" + eiDeduct + "' , '"
                + totalDeduct + "' , '" + netAmount + "')";

        stmt.executeUpdate(SQL);
    }

    public static void main(String[] args) {
        try {
            Results res = new Results();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
