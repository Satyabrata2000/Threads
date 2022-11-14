package Threads;

public class Example4 extends Thread{

    public static int amount = 0;

    public static void main(String[] args) {

        Example4 thread = new Example4();
        thread.start();
        //wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        //Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run(){
        amount++;
    }
}
