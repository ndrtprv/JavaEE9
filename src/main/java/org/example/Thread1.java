package org.example;

public class Thread1 extends Thread{
    private final Bank bank;

    public Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.inc();
    }
}
