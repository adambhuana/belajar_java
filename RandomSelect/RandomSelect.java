/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomselect;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class RandomSelect {

    public static void main (String [] args) throws InterruptedException{

         String [] arr = {"Merah", "Biru", "Kuning", "Hijau"};
         Random random = new Random();
         long start_time = System.currentTimeMillis();
         long wait_time = 20000;
         long end_time = start_time + wait_time;
        while (System.currentTimeMillis() < end_time) {
 
         // randomly selects an index from the arr
         int select = random.nextInt(arr.length); 
         
         //select = random.nextInt(arr.length); 
         // prints out the value at the randomly selected index
         System.out.println(arr[select]); 
         TimeUnit.MILLISECONDS.sleep(1000);
         }
    }
}
