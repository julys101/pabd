/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pabd2024;


import java.sql.*;

/**
 *
 * @author 20221074010031
 */
public class PABD2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Customer c = new Customer(1, "Dalai", "Lama", "dalai@microsoft.com", 10, 1);
        
        CustomerDAO dao = new CustomerDAO();
        
        dao.insertCustomer(c);
        dao.updateCustomer(611);
        dao.deleteCustomer(610);
        dao.showCustomers();
        
    }

}