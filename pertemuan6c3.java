package com.company;

import java.io.*;
public class pertemuan6c3 {
    public static void main(String[] args) {
        //program output
        try{
            FileOutputStream out = new FileOutputStream("D:/data/obat.txt");//menghasilkan output keluar
            PrintStream p = new PrintStream(out); //menyimpan output
            p.println("SYR001|paracetamo|Botol|6500");
            p.println("TAB021|Ambroxol|Tablet|450");
            p.println("TUB001|Acylovit|Tube|5000");
            p.println("TUB003|Miconazole|Tube|4400");
            p.close();
        }
        catch (Exception e){
            System.out.println("Kesalahan : "+e.getMessage());
        }
        System.out.println("Tulis file brhasil");
    }
}
