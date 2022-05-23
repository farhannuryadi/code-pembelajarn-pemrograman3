package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class pertemuan9c2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:/data/abc.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("baris kesatu"+"\n");
            bw.write("baris kedua"+"\n");
            bw.write("baris ketiga"+"\n");
            bw.write("baris keempat"+"\n");
            bw.close();
        } catch (IOException e){
            System.out.println("Kesalahan pada pnulisan text ke file");
        }
        System.out.println("File berhasi di tulis");
    }
}
