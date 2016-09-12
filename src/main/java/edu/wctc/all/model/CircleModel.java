/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.all.model;

/**
 *
 * @author alancerio18
 */
public class CircleModel {
    private double radius;
    

    public final String getCircleModel(String radius) {
        this.radius = Double.parseDouble(radius);
        
        return radius;
    }
    
    public Double CalculateRadius(){
           radius = (Math.PI * Math.pow(radius, 2));
           return radius;
    }
    public String getCalculatedArea(String radius){
        CalculateRadius();
        return "the radius of the circle is " + radius ;
    }
}
