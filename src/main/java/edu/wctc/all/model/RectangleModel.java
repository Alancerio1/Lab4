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
public class RectangleModel {
   
 
   public final Double getCalculatedArea(String length, String width) {       
        double recLength = Double.parseDouble(length);
        double recWidth = Double.parseDouble(width);
        
        return recLength * recWidth;
    }
}
   
