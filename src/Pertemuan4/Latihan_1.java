/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Riki Reza Ryansyah
 */
import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {


        Scanner Input_simpan = new Scanner(System.in);
        
        
        String nama;
        long Nim = 0;

        float Kehadiran = 0, Tugas = 0, Uts =0, Uas = 0, BobotKehadiran = 0, BobotTugas = 0, BobotUts = 0, BobotUas = 0, Total = 0, Realisasi = 21;
        System.out.println("==========================================================");
        System.out.println("Selamat Datang Di Applikasi Kami Akumulasi Nilai Mahasiswa");
        System.out.println("==========================================================");
        
        
        System.out.print("Masukkan Nama Lengkap : ");
        nama = Input_simpan.nextLine();
  
        System.out.print("Masukkan Nim : ");
        Nim = Input_simpan.nextLong();
        System.out.print("Masukkan Kehadiran : ");
        Kehadiran = Input_simpan.nextFloat();
        System.out.print("Masukkan Nilai Tugas : ");
        Tugas = Input_simpan.nextFloat();
        System.out.print("Masukkan Nilai Uts : ");
        Uts = Input_simpan.nextFloat();
        System.out.print("Masukkan Nilai Uas : ");
        Uas = Input_simpan.nextFloat();
        System.out.print("Masukan Realisasi  : ");
        Realisasi = Input_simpan.nextFloat();


        //F1
        BobotKehadiran = Kehadiran/Realisasi*10;
        BobotTugas = Tugas*20/100;
        BobotUts = Uts*30/100;
        BobotUas = Uas*40/100;
        Total = BobotKehadiran + BobotTugas + BobotUts + BobotUas;

        //S2
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("Nama  Lengkap : " + nama );
        System.out.println("Nim  : " + Nim );
        System.out.println("Kehadiran Kamu  : " + Kehadiran + " Kali ");
        System.out.println("Realisasi Kamu  : " + Realisasi);
        System.out.println("Nilai Tugas  : " + Tugas );
        System.out.println("Nilai Uts   : " + Uts );
        System.out.println("Nilai Uas   : " + Uas );
        System.out.println("Total Nilai : " + Total);

    }
}
