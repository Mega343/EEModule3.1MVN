package com.goit;

public class Main {

    public static void main(String[] args) {
        SemaphoreImpl semaphore = new SemaphoreImpl(15);
        new Thread(new Worker(semaphore, 10)).start();
        new Thread(new Worker(semaphore, 2)).start();
        new Thread(new Worker(semaphore, 4)).start();
        new Thread(new Worker(semaphore, 15)).start();
        new Thread(new Worker(semaphore, 1)).start();
    }

}