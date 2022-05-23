package com.company;

import java.sql.*;
class pertemuan14 {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection ("jdbc:sqlite:D:/db_R3B/coba.db");
        Statement st=con.createStatement();
        st.executeUpdate("drop table if exists mhs;");
        st.executeUpdate ("create table mhs (npm integer ,nama varchar(20));");
        st.executeUpdate("insert into mhs values (567,'dian');");
        st.executeUpdate("insert into mhs values (678,'aryo');");
        st.executeUpdate("insert into mhs values (789,'linda');");
        st.executeUpdate("insert into mhs values (890,'heni');");
        st.executeUpdate("update mhs set nama='haya' where npm=235;");
        st.executeUpdate("update mhs set nama='ario' where nama='aryo';");
        st.executeUpdate("delete from mhs where nama='linda';");
        ResultSet rs=st.executeQuery("select * from mhs;");
        System.out.println ("NPM \t Nama");
        while (rs.next()){
            System.out.print(rs.getInt("npm"));
            System.out.println("\t "+rs.getString("nama"));
        }
    }
}
