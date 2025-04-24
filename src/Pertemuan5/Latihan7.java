/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;

/**
 *
 * @author Riki Reza Ryansyah
 */
public class Latihan7 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
         
        System.out.println("Masukan Nilai Ganjil/Genap :");
        int Nilai = input.nextInt();
        
        if(Nilai % 2 == 0 ){
            System.out.println(Nilai + " Adalah angka Genap.");
        }else{
            System.out.println(Nilai + " Adalah Angka Ganjil.");
        }
        
    }
    
}
