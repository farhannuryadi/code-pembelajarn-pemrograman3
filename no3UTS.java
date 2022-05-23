package com.company;

import java.io.*;
public class no3UTS {
    public static void main(String[] args) {
        try{
            FileOutputStream out = new FileOutputStream("D:uap2122.txt");
            PrintStream print = new PrintStream(out);
            print.println("B632 2018 0093500 Eufloria");
            print.println("F004 2018 0084000 Kata");
            print.println("T029 2015 0127800 Javascript");
            print.println("F098 2017 0057800 Hujan");
            print.println("T578 2014 0205700 Pemrograman C#");
            print.close();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        System.out.println("Tulis file brhasil");
    }
}
