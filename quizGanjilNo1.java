package com.company;


import java.io.*;
public class quizGanjilNo1 {
    public static void main(String[] args) {
        //Farhan Nuryadi R3B (202043500181)
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Nama Mahasiswa : ");
            String nama = input.readLine();
            System.out.print("Jumlah Mata Kuliah : ");
            int n = Integer.parseInt(input.readLine());
            String data[][]=new String[n][n];
            double nilai=0.0,total=0.0,rata=0.0;

            System.out.println("---------------------------");
            for (int i=0; i<n; i++){
                System.out.print("Nilai Mata Kuliah ke-"+(i+1)+" : ");
                data[i][i]=input.readLine();
                nilai=Double.parseDouble(data[i][i]);
                total+=nilai;
            }

            rata=total/n;
            System.out.println("Nilai Rata-rata = "+rata);

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
