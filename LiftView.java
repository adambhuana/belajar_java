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
import java.awt.event.ActionListener;

import javax.swing.*;

public class LiftView extends JFrame{

        private JLabel labelLtasal = new JLabel("Lantai Asal");
	private JTextField lantaiAsal  = new JTextField(10);
        private JLabel labelLttujuan = new JLabel("Lantai Tujuan");
	private JTextField lantaiTujuan  = new JTextField(10);
	private JButton liftButton = new JButton("Jalankan Lift");
	private JTextField liftSolution = new JTextField(10);
	
	LiftView(){
		
		// Sets up the view and adds the components
		
		JPanel liftPanel = new JPanel();
                this.setTitle("My Elevator Simulation");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		liftPanel.add(labelLtasal);
		liftPanel.add(lantaiAsal);
		liftPanel.add(labelLttujuan);
		liftPanel.add(lantaiTujuan);
                liftPanel.add(liftButton);
		liftPanel.add(liftSolution);
		
		this.add(liftPanel);
		
		// End of setting up the components --------
		
	}
        public int getLantaiAsal(){
		
		return Integer.parseInt(lantaiAsal.getText());
		
	}
	
	public int getLantaiTujuan(){
		
		return Integer.parseInt(lantaiTujuan.getText());
		
	}
      
	
	public void setLiftSolution(String solution){
		
		liftSolution.setText(solution);
		
	}
        void addLiftListener(ActionListener listenForLiftButton){
		
		liftButton.addActionListener(listenForLiftButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
                liftSolution.setText("Error");
		lantaiAsal.setText("");
                lantaiTujuan.setText("");
	}
	
	
}