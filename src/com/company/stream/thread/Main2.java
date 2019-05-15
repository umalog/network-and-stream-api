package com.company.stream.thread;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Message from " + Thread.currentThread().getName());
        new Thread(() -> System.out.println("Message from " + Thread.currentThread().getName())).start();
    }
}
