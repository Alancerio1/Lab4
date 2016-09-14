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
    

  
     public final Double getCalculatedRadius(String Radius){
        double radius = Double.parseDouble(Radius);
        double radResults = radius*Math.PI;
        return radResults;
        
    }
}
