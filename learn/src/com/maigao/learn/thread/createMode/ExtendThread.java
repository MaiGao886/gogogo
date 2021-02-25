package com.maigao.learn.thread.createMode;

public class ExtendThread {

    public static void main(String[] args) {
        MyThread threadA = new MyThread("线程A");
        MyThread threadB = new MyThread("线程B");
//        MyThread threadB = threadA;  //同一线程对象不能多次调用start，因为其状态已经改变
        System.out.println(threadA.getState());
        threadA.start();
        System.out.println(threadA.getState());
        threadB.start();

    }

}

class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + "运行：" + i);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
