package com.java.project;

public class ThreadLogic {
    public static void main(String[] args){
        Thread t1 = new Thread(new RunnableProcess("Thread-1"));
        Thread t2 = new Thread(new RunnableProcess("Thread-2"));
        Thread t3 = new Thread(new RunnableProcess("Thread-3"));
        t1.start();
        t2.start();
        t3.start();
    }
}
