/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;
import java.util.Scanner;
/**
 *
 * @author labkom7
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      String nama;
      char jenisKelamin;
      int tinggibadan;
      boolean menikah;
      
      System.out.print("Masukan Nama : ");
        nama = 
      input.nextLine();          
      System.out.print("Masukan Jenis kelamin : ");
        jenisKelamin = 
      input.next().charAt(0);   
        System.out.print("Masukan Tinggi Badan : ");
        tinggibadan = 
      input.nextInt();
        System.out.print("Masukan status menikah : ");
        menikah = 
      input.nextBoolean();
        
        
              
        System.out.print("Belajar Java yuks\n");
      System.out.println("Belajar Java Yuks 1");
    }
    
}
