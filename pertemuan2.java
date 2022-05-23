package com.company;

import java.util.Scanner;

public class pertemuan2 {
    public static void main(String[] args) {

        //Deklarasi array 1 dimensi
            //Cara 1 :
                //Tipe_Data Nama_Array [] = new Tipe_data[ukuran]
                //contoh :
                    //int a [] = new int[3];
                        //a[0] = 3;
                        //a[1] = 7;
                        //a[2] = 5;


            //Cara 2 :
                //Tipe_Data Nama_Array [] = {nila1, nilai2, nilai3, ....}
                //contoh :
                    //String kota [] = {"Jakarta", "Bandung", "Semarang", "Surabaya"};

        //Contoh Program 1:
            int a [] = new int[3];
                a[0] = 5;
                a[1] = 3;
                a[2] = 9;

            String x [] = {"satu", "dua", "tiga", "empat", "lima"};

            for (int i=0; i<a.length; i++){
                System.out.println("nilai a["+i+"] = "+a[i]);
            }
            for (int i=0; i<x.length; i++){
                System.out.println("nilai x["+i+"] = "+x[i]);
            }

    }
}
