
package gamesuit;
import java.util.Scanner;
import java.util.Random;

public class Gamesuit {

    public static void main(String[] args) {
        // TODO code application logic here
        String [] arr = {"t", "j", "k"};
        String input;
        Scanner suit = new Scanner(System.in);
        Random random=new Random();
        int select = random.nextInt(arr.length); 
        select = random.nextInt(arr.length);
        System.out.println("Ketik t untuk Telunjuk, j untuk Jempol, k untuk Kelingking");
        input =suit.next();
        System.out.println("Jawaban Komputer: "+arr[select]);
        if((input.equals("t")) && (arr[select].equals("t")))
        {
            System.out.println("Hasilnya: Seri");
        }
        else
        {
            if((input.equals("t")) && (arr[select].equals("j")))
            {
                System.out.println("Komputer Menang");
            }
            else
            { 
                    if((input.equals("t")) && (arr[select].equals("k")))
                    {
                        System.out.println("Anda Menang");
                    }
                    else
                    {
                         if((input.equals("j")) && (arr[select].equals("t")))
                        {
                            System.out.println("Anda Menang");
                        }
                         else
                         {
                              if((input.equals("j")) && (arr[select].equals("j")))
                            {
                                System.out.println("Hasilnya: Seri");
                            }
                              else
                              {
                                   if((input.equals("j")) && (arr[select].equals("k")))
                                    {
                                        System.out.println("Komputer Menang");
                                    }
                                   else
                                   {
                                       if((input.equals("k")) && (arr[select].equals("t")))
                                        {
                                            System.out.println("Komputer Menang");
                                        }
                                       else
                                       {
                                             if((input.equals("k")) && (arr[select].equals("j")))
                                            {
                                                System.out.println("Anda Menang");
                                            }
                                             else
                                             {
                                                 if((input.equals("k")) && (arr[select].equals("k")))
                                                {
                                                    System.out.println("Hasilnya Seri");
                                                }
                                                 else
                                                 {
                                                     System.out.println("Maaf Tidak Sesuai Aturan Main");
                                                 }
                                             }
                                       }
                                   }
                              }
                         }
                    }
            }
        }
        
        
    }
    
}
