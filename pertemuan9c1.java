package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pertemuan9c1 {
    public static void main(String[] args) {
        String str;
        int tgs,uts,uas;
        double nilai;
        try{
            FileReader fr = new FileReader("D:/data/nilai.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null){
                tgs = Integer.parseInt(str.substring(1,3));
                uts = Integer.parseInt(str.substring(4,6));
                uas = Integer.parseInt(str.substring(7,9));
                nilai = (20*tgs+30*uts+50*uas)/100.0;
                System.out.printf(" tugas %d uts %d uas %d "+" nilai %7.2f\n",tgs,uts,uas,nilai);
            }
            br.close();
        }catch (IOException e){
            System.out.println("File read error");
        }
    }
}
