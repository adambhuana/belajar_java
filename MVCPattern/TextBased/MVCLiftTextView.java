/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclifttext;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Adam Puspabhuana
 */
public class MVCLiftTextView {
   private int lantaiAsal,lantaiTujuan;
   public void inputLiftLA(){
        Scanner inputawal = new Scanner(System.in);
        System.out.println("Input Lantai Awal");
        lantaiAsal=inputawal.nextInt();
        //System.out.println(lantaiAsal);
        //saveLantaiAsal(lantaiAsal);
  
   }
    public void inputLiftLT(){
       Scanner inputakhir = new Scanner(System.in);
        
       System.out.println("Input Lantai Tujuan");
       lantaiTujuan=inputakhir.nextInt();
       //System.out.println(lantaiTujuan);
       //saveLantaiTujuan(lantaiTujuan);
        
   }
        public int getLantaiAsal(){
		
		return lantaiAsal;
		
	}
	
	public int getLantaiTujuan(){
		
		return lantaiTujuan;
		
	}
        public void setLiftSolution(String solution){
		
		System.out.println(solution);
		
	}
        void displayErrorMessage(String errorMessage){
		
		System.out.println("error");
	}
}
