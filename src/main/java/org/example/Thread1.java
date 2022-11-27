package org.example;

public class Thread1 implements Runnable {
    private final Bank bank;

    public Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20000; i++) {
            bank.setAccount(bank.getAccount() + 2);
        }

        System.out.println("Thread increment: " + bank.getAccount());
    }
}
