package org.example;

public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        final Bank bank = new Bank();

        Thread thread1 = new Thread(new Thread1(bank));
        thread1.start();
        Thread thread2 = new Thread(new Thread2(bank));
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(bank.getAccount());
    }
}