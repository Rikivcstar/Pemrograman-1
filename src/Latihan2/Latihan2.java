/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

    import java.util.Scanner;
/**
 *
 * @author Riki Reza Ryansyah
 */
public class Latihan2 {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        String Nama = "Riki Reza Ryansyah ";
        
        int S = 0;
        int T = 0;
        int V = 0;
        
        System.out.println("Haii Selamat Datang : " + Nama + "Di App kami");
        
        System.out.println("Masukan Nilai Jarak : ");
        S = input.nextInt();
        
        System.out.println("Masukuan Nilai Waktu  : ");
        T = input.nextInt();
        
        

        V = S/T;     
           
        System.out.println("Jarak : " + S + "m");
        System.out.println("Waktu : " + T + "s");
        System.out.println( "Hasil P1/Kecepatan  V : " + V + "M/s"  );
        
        
        
        
    }
    
}
