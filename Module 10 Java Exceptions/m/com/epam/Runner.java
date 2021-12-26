package com.epam;

public class Runner {

    private static class CustomThread extends Thread {

        public void run() {
            Object a = null;

            System.out.println(a.hashCode());
            while (true) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CustomThread thread = new CustomThread();

        thread.start();
        thread.join();
    }
}
