package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class pertemuan4c5 {
    public static void main(String[] args) {
    try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Jumlah data : ");
        int jml = Integer.parseInt(br.readLine());
        String ars[][] = new String[jml][4];
        int ari[][] = new int[jml][4];
        double rata[][] = new double[jml][4];
        System.out.println("==================");
        for (int i = 0; i < jml; i++) {
            System.out.print("mata kuliah : ");
            ars[i][0] = br.readLine();
            System.out.print("nilai teori : ");
            ars[i][1] = br.readLine();
            ari[i][1] = Integer.parseInt(ars[i][1]);
            System.out.print("nilai praktikum : ");
            ars[i][2] = br.readLine();
            ari[i][2] = Integer.parseInt(ars[i][2]);
            rata[i][3] = (ari[i][1] + ari[i][2]) * 0.5;
            System.out.println();
        }
        System.out.println("Mata Kuliah\tTeori\tPraktikum|tRata-rata");
        for (int i =0; i<3; i++){
            System.out.println(ars[i][0]+"\t\t "+ari[i][1]+"\t\t "+ari[i][2]+"\t\t "+rata[i][3]);
        }
    }
    catch (Exception e){
        System.out.println((e));
    }
    }
}
