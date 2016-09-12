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
    private double length;
    private double width;
    private String area;

    public final String getRectangleModel(String length, String  width) {
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    
        return length + width;
    }
    
    public String CalculateArea(){
           area = (length * width) + "";
           return area;
    }
    public String getCalculatedArea(String length,String width){
        CalculateArea();
        return "the width is " + " " + width + " and the length is " + length + " making the area " + area ;
    }
}
