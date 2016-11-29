/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Preet Acharya
 */
public class dbconnect {
    
    private Context ctx;
    private DataSource ds;
    private Connection conn;
    
    public dbconnect(){
    }
    
    public Connection getConnection(){
        try {        
            ctx = new InitialContext();
            ds = (DataSource)ctx.lookup("jdbc/foodiesDatasource");
            conn = ds.getConnection();
        } catch (NamingException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
