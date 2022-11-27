package org.example;

public class Bank {
    private int account = 2;

    public synchronized void inc() {
        for (; account < 20000; account += 2) {
            System.out.println("Increment: " + account);
        }
    }

    public synchronized void dec() {
        for (; account > 1; account--) {
            System.out.println("Decrement: " + account);
        }
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }
}