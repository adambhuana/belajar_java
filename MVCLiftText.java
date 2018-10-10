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
public class MVCLiftText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MVCLiftTextView theView = new MVCLiftTextView();
        //theViewAsal.diplayLiftLantaiAsal();
        theView.inputLiftLA();
        theView.inputLiftLT();
        MVCLiftTextModel theModel = new MVCLiftTextModel();
        //CalculatorModel theModel = new CalculatorModel();
        MVCLiftTextController theController = new MVCLiftTextController(theView,theModel);
       
        
    }
    
    
}
