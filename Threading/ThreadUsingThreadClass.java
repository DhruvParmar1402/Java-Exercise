package org.Threading;

class thread extends Thread{
    public void run(){
        for(int i=0;i<1000;i++)
        {
            System.out.println("Hello");
        }
    }
}

class thread2 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++)
        {
            System.out.println("Hi");
        }
    }
}

public class ThreadUsingThreadClass {
    public static void main(String[] args) {
        thread t1=new thread();
        thread2 t2=new thread2();

        t1.start();
        t2.start();
    }
}
