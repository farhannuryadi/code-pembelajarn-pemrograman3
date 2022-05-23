package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UapNo4 {
    public static void main (String[] args){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db_Y3E_Adhisa/AdhisaDwiFebrianti.db");
            Statement stat = con.createStatement();

            Scanner input = new Scanner(System.in).useDelimiter("\n");
            System.out.println("~UBAH DATA NILAI MAHASISWA~");
            System.out.println("=============================================================================");
            System.out.print("Input NPM             : "); String cari = input.next();
            System.out.println("~Hasil pencarian data~");
            System.out.println("-----------------------------------------------------------------------------");

            String npm=null,nama=null,kelas=null,ket=null;
            int teori=0,praktikum=0;
            double nilaiAkhir;

            ResultSet rs = stat.executeQuery("select * from mahasiswa where NPM='"+cari+"';");
            while (rs.next()) {
                npm=rs.getString("NPM");
                nama=rs.getString("Nama");
                kelas=rs.getString("Kelas");
                teori=rs.getInt("Teori");
                praktikum=rs.getInt("Praktikum");
            }

            System.out.println("\t Nama             : "+nama);
            System.out.println("\t Kelas            : "+kelas);
            System.out.println("\t Nilai Teori      : "+teori);
            System.out.println("\t Nilai Praktikum  : "+praktikum);
            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("~Input perubahan data~");
            System.out.print("Input Nama             : "); nama = input.next();
            System.out.print("Input Kelas            : "); kelas = input.next();
            System.out.print("Input Nilai Teori      : "); teori = input.nextInt();
            System.out.print("Input Nilai Praktikum  : "); praktikum = input.nextInt();
            //stat.executeUpdate("update mahasiswa set Nama='"+nama+"',Kelas='"+kelas+"',Teori="+teori+",Praktikum="+praktikum+" where NPM='"+cari+"';");

            System.out.println("=============================================================================");
            System.out.println("\t\t\t DATA NILAI MAHASISWA");
            System.out.println("=============================================================================");
            nilaiAkhir=(double) (teori*0.3)+(praktikum*0.7);
            if (nilaiAkhir>=70){
                ket="LULUS";
            }else {
                ket="TIDAK LULUS";
            }
            System.out.println("NPM \t\t Nama Mahasiswa \t Kelas \t Teori \t Praktikum \t Nilai Akhir \t Keterangan");
            System.out.printf("%-10s %-15s %-5s %-5d %-5d %-5.2f %s", npm, nama, kelas, teori, praktikum, nilaiAkhir, ket);

        }catch (Exception e){
            System.out.println("Kesalahan "+e.getMessage());
        }
    }
}
