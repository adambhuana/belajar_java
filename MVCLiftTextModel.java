/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclifttext;

/**
 *
 * @author Adam Puspabhuana
 */
public class MVCLiftTextModel {
     // Holds the value of the sum of the numbers

	    // entered in the view

	    private String LiftMove="";

	    public void runLift(int lantaiAsal, int lantaiTujuan){
                if(lantaiAsal<lantaiTujuan)
                {
                    for (int i = lantaiAsal; i <= lantaiTujuan; i++) {
                    // Print the value of i
                      LiftMove=LiftMove+"Naik ke Lantai: "+i+"\n";
                        
                    }
                }
                else
                {
                   if(lantaiAsal>lantaiTujuan)
                   {
                       for (int i = lantaiAsal; i >= lantaiTujuan; i--) {
                    // Print the value of i
                      LiftMove=LiftMove+"Turun ke Lantai: "+i+"\n";
                        
                       }
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
