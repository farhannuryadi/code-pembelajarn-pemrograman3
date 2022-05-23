package com.company;

import java.util.Scanner;

public class pertemuan3c2 {
    public static void main(String[] args) {
        Scanner fa=new Scanner(System.in);

        System.out.print("Jumlah Data   : "); int jdata=fa.nextInt();

        String data[][]=new String[jdata][3];

        for (int i=0; i<jdata; i++){
            System.out.print("NPM           : "); data[i][0]=fa.next();
            System.out.print("Nama          : "); data[i][1]=fa.next();
            System.out.print("Alamat        : "); data[i][2]=fa.next();
            System.out.println();
        }

        System.out.println("-------------------------");
        System.out.println("NPM\tNama\tAlamat");
        System.out.println("-------------------------");
        for (int i=0; i<jdata; i++){
            System.out.print(data[i][0]+"\t"+data[i][1]+"\t\t"+data[i][2]);
            System.out.println();
        }
    }
}
