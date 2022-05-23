package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pertemuan10c2 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

            System.out.print("NPM : ");
            String npm = br.readLine();
            System.out.print("Nama : ");
            String nama = br.readLine();
            System.out.print("Nilai Tugas : ");
            String TUGAS = br.readLine();
            int tgs = Integer.parseInt(TUGAS);
            System.out.print("Nilai UTS : ");
            String UTS = br.readLine();
            int uts = Integer.parseInt(UTS);
            System.out.print("NIlai UAS : ");
            String UAS = br.readLine();
            int uas = Integer.parseInt(UAS);

            double akhir = 0.2*tgs+0.3*uts+0.5*uas;

            char ket=' ';
            if (akhir>=88) ket ='A';
            else if (akhir>=76) ket = 'B';
            else if (akhir>=56) ket = 'C';
            else if (akhir>=45) ket = 'D';

            System.out.println("Nilai Akhir : " +akhir);
            System.out.println("Nilai Huruf : " +ket);
        }
        catch (IOException e){
            System.out.println("Ada Kesalahan "+e.getMessage());
        }
    }
}
