package org.example;

public class Thread2 implements Runnable{
    private final Bank bank;

    public Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20000; i++) {
            bank.setAccount(bank.getAccount() - 1);
        }

        System.out.println("Thread decrement: " + bank.getAccount());
    }
}
