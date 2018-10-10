/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclifttext;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adam Puspabhuana
 */
public class MVCLiftTextController {
    private MVCLiftTextView theView;
    private MVCLiftTextModel theModel;
	
	public MVCLiftTextController(MVCLiftTextView theView, MVCLiftTextModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		int la1,lt1;
		try{
			     	la1 = theView.getLantaiAsal();
				lt1 = theView.getLantaiTujuan();
				//System.out.println(la1);
                                //1System.out.println(lt1);
                               
                                theModel.runLift(la1, lt1);
				theView.setLiftSolution(theModel.getLiftValue());
                                
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
               
	}
        
    
}
