package org.example;

public class Thread2 implements Runnable{
    private final Bank bank;

    public Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.dec();
    }
}
