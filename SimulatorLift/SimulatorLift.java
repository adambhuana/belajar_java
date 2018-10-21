/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatorlift;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adam Puspabhuana
 */
public class SimulatorLift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int asal;
        int tujuan;
        String input1;
        String input2;
        String input;
        Scanner inputawal = new Scanner(System.in);
        Scanner inputakhir=new Scanner(System.in);
        System.out.println("Input Lantai Awal");
        asal=inputawal.nextInt();
        System.out.println("Input Lantai Tujuan");
        tujuan=inputawal.nextInt();
        if(asal<tujuan)
        {
           System.out.println("Naik");
        }
        else
        {
            System.out.println("Turun");
        }
        
        
         
    }
    
}
