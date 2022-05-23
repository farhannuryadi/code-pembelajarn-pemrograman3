package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class cobaP14c2 {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection koneksi = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/Nilai_MHS.db");
            Statement stat = koneksi.createStatement();
            ResultSet set = stat.executeQuery("select * from nilai;");
            while (set.next()) {
                int a = set.getInt("npm");
                System.out.print(a);
                String b = set.getString("namaMhs");
                System.out.print("\t" + b);
                double c = set.getDouble("UTS");
                System.out.print("\t" + c);
                double d = set.getDouble("UAS");
                System.out.print("\t" + d);
                System.out.println();
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error : " + e.getMessage());
        }
    }

}
