package com.company;

import java.util.Scanner;

public class pertemuan3t1 {
    public static void main(String[] args) {
        Scanner fa=new Scanner(System.in);
        System.out.print("Jumlah Data   : "); int jdata=fa.nextInt();
        System.out.println("----------------------------------------");
        String data[][]=new String[jdata][4];
        for (int i=0; i<jdata; i++){
            System.out.print("Mata Kuliah          : "); data[i][0]=fa.next();
            System.out.print("Nilai Teori          : "); data[i][1]=fa.next();
            System.out.print("Nilai Praktikum      : "); data[i][2]=fa.next();
            System.out.println();
        }
        int teori =0 ;
        int praktikum = 0;
        int total = 0;
        int rata = 0;
        for (int i=0; i<jdata; i++){
            teori = Integer.parseInt(data[i][1]);
            praktikum = Integer.parseInt(data[i][2]);
            total = teori + praktikum;
            rata = total/2;
            data[i][3] = String.valueOf(rata);
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Mata Kuliah\tTeori\tPraktikum\tRata-rata");
        System.out.println("----------------------------------------");
        for (int i=0; i<jdata; i++){
            System.out.print(data[i][0]+"\t\t\t"+data[i][1]+"\t\t"+data[i][2]+"\t\t\t"+data[i][3]);
            System.out.println();
        }
    }
}
