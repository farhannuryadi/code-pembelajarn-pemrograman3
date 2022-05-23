package com.company;

import java.io.*;
public class pertemuan6t2 {
    public static void main(String[] args) {
        //program input di gabung substring
        String x;
        int tugas=0,uts=0,uas=0,jumlah=0,n=0;
        double na=0;
        try{
            FileInputStream fstream = new FileInputStream("D:/data/tugasP3.txt");//membaca input dari file luar
            DataInputStream datainput = new DataInputStream(fstream);//menyimpan file input

            System.out.println("No.\t\tTugas\t\tUTS\t\tUAS\t\tNilai Akhir");
            while (datainput.available() !=0){
                x=datainput.readLine();
                tugas=Integer.parseInt(x.substring(1,3));//substring
                uts=Integer.parseInt(x.substring(6,8));//substring
                uas=Integer.parseInt(x.substring(9,11));//substring
                n=n+1;
                na=(tugas*0.2)+(uts*0.3)+(uas*.05);
                jumlah= (int)(jumlah+na);
                System.out.println(n+"\t\t"+tugas+"\t\t\t"+uts+"\t\t"+uas+"\t\t"+na);
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
