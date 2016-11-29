/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Preet Acharya
 */
@ManagedBean
@SessionScoped
public class FoodiesMeals {
    
    private int meal_id;
    private int category_id;
    private String meal_name;
    private double meal_price;
    private String meal_description;

    public FoodiesMeals(int meal_id, int category_id, String meal_name, double meal_price, String meal_description) {
        this.meal_id = meal_id;
        this.category_id = category_id;
        this.meal_name = meal_name;
        this.meal_price = meal_price;
        this.meal_description = meal_description;
    }

    public int getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(int meal_id) {
        this.meal_id = meal_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public double getMeal_price() {
        return meal_price;
    }

    public void setMeal_price(double meal_price) {
        this.meal_price = meal_price;
    }

    public String getMeal_description() {
        return meal_description;
    }

    public void setMeal_description(String meal_description) {
        this.meal_description = meal_description;
    }
    
}
