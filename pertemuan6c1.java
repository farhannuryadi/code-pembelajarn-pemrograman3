package com.company;

import java.io.*;
public class pertemuan6c1 {
    public static void main(String[] args) {
        //program input
        try{
            FileInputStream fs = new FileInputStream("D:/data/harga.txt");//membaca input dari file luar
            DataInputStream di = new DataInputStream(fs);//menyimpan file input
            String a=di.readLine();

            while (di.available() !=0){
                String data = di.readLine();
                System.out.println(data);
            }
            di.close();
        }
        catch (Exception e){
            System.out.println("ada kesalahan : "+e.getMessage());
        }

    }
}
