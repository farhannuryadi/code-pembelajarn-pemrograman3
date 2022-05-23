package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class contohUas3 {
    public static void main (String[] args){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/UAS2021.db");
            Statement stat = con.createStatement();

            Scanner input = new Scanner(System.in);
            System.out.print("Pilih kategori pencarian >> [id/nama/gol] : "); String excep = input.next();
            System.out.print("Masukan kata Kunci Pencarian : "); String nilai = input.next();
            String que=" ";
            if (excep.equalsIgnoreCase("id")){
                que = "select * from pegawai where ID like'"+nilai+"%';";
            }else if (excep.equalsIgnoreCase("nama")){
                que = "select * from pegawai where nama like '%"+nilai+"%'";
            }else if (excep.equalsIgnoreCase("gol")){
                que = "select * from pegawai where Golongan="+nilai+"";
            }else {
                System.out.println("anda salah memasuka kata kunci!!");
            }
            ResultSet rs = stat.executeQuery(que);
            System.out.println("Hasil Pencarian :");
            System.out.println("--------------------------------------------");
            System.out.println("ID\tNama Pegawai\tGolongan\tGaji Pokok\tTunjangan\tTotal Gaji");
            while (rs.next()) {
                System.out.print(rs.getString("ID")+" ");
                System.out.print(rs.getString("nama"));
                System.out.print("\t"+rs.getInt("Golongan"));
                System.out.print("\t\t"+rs.getInt("gaji_pokok"));
                System.out.print("\t\t"+rs.getInt("tunjangan"));
                System.out.println("\t\t"+rs.getInt("total_gaji"));
            }
        }catch (Exception e){
            System.out.println("Kesalahan "+e.getMessage());
        }
    }
}
