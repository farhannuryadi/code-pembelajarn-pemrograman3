package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class No1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:/data/abc.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("B632 2018 0093500 Eufloria"+"\n");
            bw.write("F004 2018 0084000 Kata"+"\n");
            bw.write("T029 2015 0127800 Javascript"+"\n");
            bw.write("F098 2017 0057800 Hujan"+"\n");
            bw.write("T578 2014 0205700 Pemrograman C#"+"\n");
            bw.close();
        } catch (IOException e){
            System.out.println("Kesalahan pada pnulisan text ke file");
        }
        System.out.println("File berhasi di tulis");
    }
}
