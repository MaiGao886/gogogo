package com.maigao.gogogo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) {


        RandomAccessFile raf = null;
        try {
            raf = RAFTestFactory.getRAFWithModelRW();
            raf.seek(2);
            String word = "ljh";
            raf.write(word.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
