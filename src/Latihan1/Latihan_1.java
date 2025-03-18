/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

import java.util.Scanner;

/**
 *
 * @author Riki Reza Ryansyah
 */
public class Latihan_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Usia = 0;
        String Nama = "RIKI REZA RYANSYAH";
        System.out.println("Hello" + Nama + "  Walcome To MyAplication :) " );
        
        System.out.println("===============================");
        
        System.out.println("Masukan Usia Anda : ");
        Usia = input.nextInt();
        
        
        System.out.println("Usia Anda Adalah : " + Usia + " Tahun");
    }
    
}
