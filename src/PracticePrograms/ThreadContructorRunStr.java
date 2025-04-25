package PracticePrograms;

public class ThreadContructorRunStr implements Runnable {

    public void run(){
        System.out.println("Now the thread is running");
    }

    public static void main(String[] args){
        Runnable r1 = new ThreadContructorRunStr();
        Thread th1 = new Thread(r1, "New thread created");
        th1.start();
        String name = th1.getName();
        System.out.println("Name of the thread is: "+name);

    }
}
