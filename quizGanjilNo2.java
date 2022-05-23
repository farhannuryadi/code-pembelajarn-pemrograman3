package com.company;

import java.io.FileOutputStream;
import java.io.PrintStream;
public class quizGanjilNo2 {
    public static void main(String[] args) {
        //Farhan Nuryadi R3B (202043500181)
        try{
            FileOutputStream out = new FileOutputStream("D:/menu_FarhanNuryadi.txt");//menyimpan hasil
            PrintStream p = new PrintStream(out);
            p.println("Menu Restoran Informatika :  ");
            p.println("-----------------------------");
            p.println("1. Nasi Goreng Java  Rp 14000");
            p.println("2. Ayam Bakar Pascal Rp 16000");
            p.println("3. Mocca Flash       Rp 12500");
            p.println("4. Bebek Visual      Rp 23000");
            p.println("-----------------------------");
            p.close(); //menghentikan cetak
        }
        catch (Exception e){
            System.out.println("Kesalahan : "+e.getMessage());
        }
        System.out.println("Tulis file brhasil");
    }
}
