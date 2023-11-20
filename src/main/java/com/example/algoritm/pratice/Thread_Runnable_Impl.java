package com.example.algoritm.pratice;

public class Thread_Runnable_Impl implements Runnable {

    String str;

    public Thread_Runnable_Impl(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
