package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class cobamethod {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/namadatabaselu.db");
            Statement stat = con.createStatement();
            char grade=' ';

            Scanner input = new Scanner(System.in).useDelimiter("\n");
            System.out.println("DATA NILAI PEMROGRAMAN 3");
            System.out.println("============================================");
            System.out.println("Masukan Kata Kunci Pencarian : "); String find = input.next();
            System.out.println("============================================");
            System.out.println("Hasil Pencarian :\n");
            System.out.println("--------------------------------------------");

            ResultSet rs = stat.executeQuery("select NPM, Nama, Kelas, rata from mahasiswa where NPM like'"+find+"%' or Nama like '"+find+"%';");
            System.out.println("NPM\tNama Mahasiswa\tKelas\tRata-rata\tGrade");

            while (rs.next()) {
                System.out.print(rs.getString("NPM")+" ");
                System.out.print(rs.getString("Nama"));
                System.out.print("\t"+rs.getString("Kelas"));
                System.out.print("\t\t"+rs.getInt("rata"));
                int a = rs.getInt("rata");
                if (a>=85){ grade='A'; }
                else if (a>=70){ grade='B';}
                else if (a>=56){ grade='C';}
                else if (a>=45){ grade='D';}
                else{ grade='E';}
                System.out.println(grade);
            }
        }catch (Exception e){
            System.out.println("Kesalahan "+e.getMessage());
        }
    }
}
