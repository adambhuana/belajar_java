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
public class MVCLift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LiftView theView = new LiftView();
        LiftModel theModel = new LiftModel();
        //CalculatorModel theModel = new CalculatorModel();
        LiftController theController = new LiftController(theView,theModel);
        theView.setVisible(true);
    }
    
}
