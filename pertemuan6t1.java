package com.company;

import java.io.*;
public class pertemuan6t1 {
    public static void main(String[] args) {
        //program output
        try{
            FileOutputStream out = new FileOutputStream("D:/data/tugasP3.txt");//menghasilkan output keluar
            PrintStream p = new PrintStream(out); //menyimpan output
            p.println("9981117806701");
            p.println("0832348108521");
            p.println("1560016594591");
            p.println("3452416706704");
            p.println("5560247018199");
            p.close();
        }
        catch (Exception e){
            System.out.println("Kesalahan : "+e.getMessage());
        }
        System.out.println("Tulis file brhasil");
    }
}
