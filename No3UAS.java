package com.company;


import java.sql.*;
import java.util.Scanner;
public class No3UAS {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/FarhanNuryadi.db");
            Statement stat = con.createStatement();
            char ket=' ';

            Scanner input = new Scanner(System.in).useDelimiter("\n");
            System.out.println("DATA NILAI PEMROGRAMAN 3");
            System.out.println("============================================");
            System.out.println("Masukan Kata Kunci Pencarian : "); String cari = input.next();
            System.out.println("============================================");
            System.out.println("Hasil Pencarian :\n");
            System.out.println("--------------------------------------------");

            String que = "select NPM, Nama, Kelas, rata_rata from mahasiswa where NPM like'"+cari+"%' or Nama like '"+cari+"%';";
            ResultSet rs = stat.executeQuery(que);
            System.out.println("NPM\tNama Mahasiswa\tKelas\tRata-rata\tGrade");

            while (rs.next()) {
                System.out.print(rs.getString("NPM")+" ");
                System.out.print(rs.getString("Nama"));
                System.out.print("\t"+rs.getString("Kelas"));
                System.out.print("\t\t"+rs.getInt("rata_rata"));
                int rata = rs.getInt("rata_rata");
                if (rata>=85){ ket='A'; }
                else if (rata>=70){ ket='B';}
                else if (rata>=56){ ket='C';}
                else if (rata>=45){ ket='D';}
                else{ ket='E';}
                System.out.println(ket);
            }
        }catch (Exception e){
            System.out.println("Kesalahan "+e.getMessage());
        }
    }
}
