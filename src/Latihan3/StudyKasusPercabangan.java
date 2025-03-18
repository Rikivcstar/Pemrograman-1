/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

import java.util.Scanner;

/**
 *
 * @author Riki Reza Ryansyah
 */
public class StudyKasusPercabangan {
    
    public static void main(String[] args) {
        try
            (Scanner input = new Scanner(System.in)){
            System.out.println("Masukan Nama :");
            String Nama = input.nextLine();
            
            
            System.out.println("Masukan Nim : ");
            String Nim = input.nextLine();
            
            System.out.println("Masukan Nilai : ");
            double Grade = input.nextDouble();
            
            String HasilKelulusan;
            
            if(Grade >= 75){
                HasilKelulusan = "Lulus";
            }else{
                HasilKelulusan = "Tidak Lulus";
            }
                
            
            
            System.out.println("\n =====================");
            System.out.println("Nama  : " + Nama);
            System.out.println("Nim : "+ Nim);
            System.out.println("Nilai  : " + Grade);
            System.out.println("Hasil Kelulusan : " + HasilKelulusan);
            
            System.out.println("=============================");
            
            
            
        }
    }
}
