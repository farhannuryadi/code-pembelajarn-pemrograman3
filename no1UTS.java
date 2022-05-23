package com.company;

import java.util.Scanner;
public class no1UTS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Tanggal       : "); String tanggal=input.nextLine();
        System.out.print("Nama Dokter   : "); String dokter=input.nextLine();
        System.out.println();
        System.out.print("Jumlah Data   : "); int jdata=input.nextInt();
        System.out.println("======================================================================");

        String data[][]=new String[jdata][4];
        for (int i=0; i<jdata; i++){
            System.out.print("ID Pasien     : "); data[i][0]=input.next();
            System.out.print("Berat Badan   : "); data[i][1]=input.next();
            System.out.print("Tinggi Badan  : "); data[i][2]=input.next();
            System.out.println();
        }

        System.out.println("======================================================================");
        System.out.println("\t\t\t\t\t\t\t   KLINIK GIZI");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Dokter : "+dokter);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tTanggal : "+tanggal);
        System.out.println("======================================================================");
        System.out.println("No.\tID Pasien\tBerat Badan\t\tTinggi Badan\tBMI\t\tStatus");
        System.out.println("======================================================================");
        System.out.println();

        double bmi [] = new double[jdata];
        String ket = " ";
        for (int i=0; i<jdata; i++){
            int berat = Integer.parseInt(data[i][1]);
            double tinggi = Double.parseDouble(data[i][2]);
            bmi[i]= berat/Math.pow((tinggi/100),2);

            if (bmi[i] < 18.5){
                ket ="Kekurangan BB";
            } else if (bmi[i] <= 24.99){
                ket ="Ideal";
            } else if (bmi[i] <= 29.99){
                ket ="Kelebian BB";
            } else {
                ket ="Obesitas";
            }

            data[i][3] = ket;
        }

        for (int j=0; j<jdata; j++){
            System.out.printf("%-6d %-13s %-15s %-10s %-8.2f %s",(j+1),data[j][0],data[j][1],data[j][2],bmi[j],data[j][3]);
            System.out.println();
        }
    }
}
