/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    Connection cn;
    //Constructor
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/BBDDjava","root","ferylau8");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            
            System.err.println(e.getMessage());
        }
        return cn;
    }
}
