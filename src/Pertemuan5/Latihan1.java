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
public class Latihan1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float v = 0, s = 0, t = 0;
        String Jawaban = "", Cari = "";
        
        System.out.println("v : Kecepatan ");
        System.out.println("s: Jarak ");
        System.out.println("t : Waktu ");
        System.out.println("Pilih Nilai Yang Di ingin di input : ");
        Jawaban = input.next();
        
        if(Jawaban.equalsIgnoreCase("v")){
            System.out.println("Masukan Jarak : ");
            s = input.nextFloat();
            System.out.println("Masukan Waktu : ");
            t = input.nextFloat();
            
            v = s/t;
            Cari = "Nilai Kecepatan";
            
        } else if(Jawaban.equalsIgnoreCase("s")){
            System.out.println("Masukan Kecepatan : ");
            v = input.nextFloat();
            System.out.println("Masukan Waktu : ");
            t = input.nextFloat();
            
            s = v * t;
            Cari = "Nilai Jarak";
            
        } else if(Jawaban.equalsIgnoreCase("t")){
            System.out.println("Masukan Jarak : ");
            s = input.nextFloat();
            System.out.println("Masukan Kecepatan : ");
            v = input.nextFloat();
            
            t = s / v;
            Cari = "Nilai Waktu";
        } 
        
        System.out.println("Kamu Mencari  : " + Cari);
        System.out.println("=============================");
        System.out.println("Jarak : " + s);
        System.out.println("Waktu : " + t);
        System.out.println("Kecepatan : " + v);
    }
}