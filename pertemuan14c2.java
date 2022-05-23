package com.company;

import java.sql.*;
public class pertemuan14c2 {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection koneksi = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/kampus.db");
            Statement stat = koneksi.createStatement();
            ResultSet set = stat.executeQuery("select * from barang");
            while (set.next()) {
                String a = set.getString("kode_barang");
                System.out.print(a);
                String b = set.getString("Nama_barang");
                System.out.print("\t" + b);
                int c = set.getInt("harga");
                System.out.print("\t" + c);
                System.out.println();
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error : " + e.getMessage());
        }
    }
}

