/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclift;

import java.util.concurrent.TimeUnit;
import javax.swing.Timer; 

/**
 *
 * @author Adam Puspabhuana
 */
public class LiftModel {
	    // Holds the value of the sum of the numbers

	    // entered in the view

	    private String LiftMove="";

	    public void runLift(int lantaiAsal, int lantaiTujuan){
                if(lantaiAsal<lantaiTujuan)
                {
                    
                      LiftMove="Naik";
                }
                else
                {
                   if(lantaiAsal>lantaiTujuan)
                   {
                       LiftMove="Turun";
                   }
                   else
                   {
                       LiftMove="Diam";
                   }
                }
	    }
	    public String getLiftValue(){
	        return LiftMove;
	    }
}

