package com.maigao.learn.thread.createMode;

public class RunnableThread implements Runnable{
    private String threadName;

    public RunnableThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + "运行：" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    public static void main(String[] args) {
        new Thread(new RunnableThread("线程A")).start();
        new Thread(new RunnableThread("线程B")).start();

    }
}
