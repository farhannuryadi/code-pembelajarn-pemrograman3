package com.company;

import java.io.*;
public class pertemuan6c2 {
    public static void main(String[] args) {
        //program input di gabung substring
        String x;
        int harga=0,jumlah=0,n=0;
        try{
            FileInputStream fstream = new FileInputStream("D:/data/harga.txt");//membaca input dari file luar
            DataInputStream datainput = new DataInputStream(fstream);//menyimpan file input

            while (datainput.available() !=0){
                x=datainput.readLine();
                harga=Integer.parseInt(x.substring(1,5));//substring
                n=n+1;
                jumlah=jumlah+harga;
                System.out.println("Harga hari ke "+n+" : "+harga);
            }
            datainput.close();
        }
        catch (Exception e){
            System.out.println("file input error");
        }
        double rata2=(double)jumlah/n;
        System.out.println("haraga buncis rata-rata "+rata2);
    }

}

