package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class pertemuan15c2 {
    public static void main(String[] args) {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/kampus.db");
            Statement s = c.createStatement();

            Scanner f = new Scanner(System.in);
            System.out.println("Ubah Record...");
            System.out.print("Kode Barang : "); String ko = f.nextLine();
            System.out.print("Nama Barang : "); String nb = f.nextLine();
            System.out.print("Harga       : "); int hg = f.nextInt();

            s.executeUpdate("update barang set Nama_barang='"+nb+"',harga="+hg+" where kode_barang='"+ko+"';");

            System.out.println("Kode\tNama Barang\tStok\tHarga");
            System.out.println("========================");
            ResultSet rs = s.executeQuery("select * from barang;");
            while (rs.next()){
                System.out.print(rs.getString("kode_barang"));
                System.out.print("\t"+rs.getString("Nama_barang"));
                System.out.print("\t\t"+rs.getInt("stok"));
                System.out.println("\t"+rs.getInt("harga"));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
