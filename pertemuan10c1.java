package com.company;

import java.util.Scanner;

public class pertemuan10c1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("NPM : ");
        String npm = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Nilai Tugas : ");
        int tgs = sc.nextInt();
        System.out.print("Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("NIlai UAS : ");
        int uas = sc.nextInt();

        double akhir = 0.2*tgs+0.3*uts+0.5*uas;

        char ket=' ';
        if (akhir>=88) ket ='A';
        else if (akhir>=76) ket = 'B';
        else if (akhir>=56) ket = 'C';
        else if (akhir>=45) ket = 'D';

        System.out.println("Nilai Akhir : " + akhir);
        System.out.println("Nilai Huruf : " + ket);
    }
}
