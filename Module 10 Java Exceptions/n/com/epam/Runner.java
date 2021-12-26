package com.epam;

public class Runner {

    public static class CustomThread extends Thread {

        public void run() {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CustomThread thread = new CustomThread();

        Thread.setDefaultUncaughtExceptionHandler(new
                Thread.UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.err.println("UncaughtException");
            }
        });
        thread.start();
        thread.join();
    }
}
