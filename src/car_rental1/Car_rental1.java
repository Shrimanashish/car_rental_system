/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car_rental1;
import java.sql.*;

/**
 *
 * @author Asish Varma
 */
public class Car_rental1 {
     public Connection con;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","Ashish@123456");
           if(con!=null){
               System.out.println("Successfully connected");
           }
       }catch(Exception e){
           System.out.println(e);
           System.out.println("Not connected");
    }
        
    }
    
}
