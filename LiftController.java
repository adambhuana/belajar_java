/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclift;

/**
 *
 * @author Adam Puspabhuana
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class LiftController {
	
	private LiftView theView;
	private LiftModel theModel;
	
	public LiftController(LiftView theView, LiftModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addLiftListener(new LiftListener());
	}
	
	class LiftListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int lantaiAsal,lantaiTujuan= 0;
			
			
			try{
			
				lantaiAsal = theView.getLantaiAsal();
				lantaiTujuan = theView.getLantaiTujuan();
				
				theModel.runLift(lantaiAsal, lantaiTujuan);
				theView.setLiftSolution(theModel.getLiftValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
}
