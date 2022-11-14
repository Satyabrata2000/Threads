package Threads;

//Concurrency problems
public class Example3 extends Thread{

    public static int amount = 0;

    public static void main(String[] args) {

        Example3 thread = new Example3();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
