package com.gmail.danielvandenberg95;

public class ComToKeyboard {
    public static void main(String[] args) {
        System.out.println("test");
        final AcceptThread acceptThread = new AcceptThread();
        acceptThread.start();
        new SystemTrayController(acceptThread).start();
    }
}
