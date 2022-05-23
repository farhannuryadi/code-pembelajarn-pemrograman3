package com.company;

import java.io.*;
public class no4UTS {
    public static void main(String[] args) {
        long gapok=0;
        double tunjangan=0.0f,totalGaji=0.0f;
        try {
            FileInputStream file = new FileInputStream("D:pegawai.txt");
            DataInputStream datainput = new DataInputStream(file);
            System.out.println("======================================================================================");
            System.out.println("ID Pegawai\t\tNama Pegawai\t\tGol\t\tGaji Pokok\t\tTunjangan\t\tTotal Gaji");
            System.out.println("--------------------------------------------------------------------------------------");

            while (datainput.available() !=0){
                String data = datainput.readLine();
                String gol = data.substring(9,10);
                switch (gol){
                    case "1" :
                        gapok = 3000000; tunjangan = (0.05*gapok);
                        break;
                    case "2" :
                        gapok = 4500000; tunjangan = (0.1*gapok);
                        break;
                    case "3" :
                        gapok = 6000000; tunjangan = (0.15*gapok);
                        break;
                    case "4" :
                        gapok = 8000000; tunjangan = (0.2*gapok);
                        break;
                    default:
                }

                totalGaji=gapok+tunjangan;
                System.out.print(" "+data.substring(0,8));
                System.out.print("\t\t"+data.substring(11));
                System.out.print("\t\t"+data.substring(9,10));
                System.out.print("\t\t"+gapok);
                System.out.print("\t\t\t"+tunjangan);
                System.out.println("\t\t"+totalGaji);
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
