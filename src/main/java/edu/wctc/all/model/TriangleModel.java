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
public class TriangleModel {
    private double opposite;
    private double adjacent;
    private String hypotenuse;

    public final String getRectangleModel(String opposite, String  adjacent) {
        this.opposite = Double.parseDouble(opposite);
        this.adjacent = Double.parseDouble(adjacent);
    
        return opposite + adjacent;
    }
    
    public String CalculateHypotenuse(){
           hypotenuse = Math.sqrt(Math.pow(adjacent,2) + Math.pow(opposite,2)) + "";
           return hypotenuse;
    }
    public String getCalculatedArea(String length,String width){
        CalculateHypotenuse();
        return "the hypotenuse of the triangle is " + hypotenuse ;
    }
}
