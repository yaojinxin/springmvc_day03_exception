package com.aeolia.demo;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream=new FileInputStream("C:\\Users\\63495\\Desktop\\abc.txt");

            byte[] bytes=new byte[1024];
            int len;
            if ((len=inputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
