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

    public final Double getHypotenouse(String opposite, String adjacent) {
        double opp = Double.parseDouble(opposite);
        double adj = Double.parseDouble(adjacent);

        double oppSquared = Math.sqrt(opp);
        double adjSquared = Math.sqrt(adj);

        double hypotenuse = Math.sqrt(oppSquared + adjSquared);
        return hypotenuse;
    }
}
