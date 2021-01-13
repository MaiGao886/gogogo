package com.maigao.gogogo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFTestFactory{
        private static final String url = "D:\\text\\test.txt";
        private static final String [] model = {"r","rw","rws","rwd"};

        public static RandomAccessFile getRAFWithModelR() throws FileNotFoundException {
            RandomAccessFile raf = new RandomAccessFile(new File(url), model[0]);
            return raf;
        }

        public static RandomAccessFile getRAFWithModelRW() throws FileNotFoundException {
            File file = new File(url);
            if (!file.exists()){
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()){
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            RandomAccessFile raf = new RandomAccessFile(file, model[1]);
            return raf;
        }

        public static RandomAccessFile getRAFWithModelRWS() throws FileNotFoundException {
            RandomAccessFile raf = new RandomAccessFile(new File(url), model[2]);
            return raf;
        }

        public static RandomAccessFile getRAFWithModelRWD() throws FileNotFoundException {
            RandomAccessFile raf = new RandomAccessFile(new File(url), model[3]);
            return raf;
        }
}
