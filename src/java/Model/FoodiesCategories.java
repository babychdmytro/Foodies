/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Preet Acharya
 */
@ManagedBean
@SessionScoped
public class FoodiesCategories {
    
    private int category_id;
    private String category_name;

    public FoodiesCategories() {
        
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    
    
    
    
    public List<FoodiesCategories> getCategories()
    {
        List<FoodiesCategories> list = new ArrayList<FoodiesCategories>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try
        {
        dbconnect db = new dbconnect();
        con = db.getConnection();

        String sql = "select category_name from foodies_categories";
        ps= con.prepareStatement(sql); 
        rs= ps.executeQuery(); 
            while (rs.next())
            {
            FoodiesCategories fc = new FoodiesCategories();
            fc.setCategory_name(rs.getString("category_name"));
            list.add(fc);
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
            con.close();
            ps.close();
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
        }
        return list;
    }
    
}
