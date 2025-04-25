package PracticePrograms;

class ThreadTest implements Runnable{

    public ThreadTest(String name, ThreadGroup tg1){
        super();
    }

    public void run(){
        System.out.println("The thread has run");
    }
}

public class ThreadGroupImplementRunnable {

    public static void main(String[] args){
        ThreadGroup tg1 = new ThreadGroup("Parent Thread Group");
        ThreadGroup tg2 = new ThreadGroup(tg1, "Child Thread Group");

        Runnable runnable = new ThreadTest("Thread One", tg1);
        ThreadTest runnable1 = new ThreadTest("Thread two", tg1);
        Thread th1 = new Thread(runnable, "Thread One");
        Thread th2 = new Thread(runnable1, "Thread Two");
        th1.start();
        th2.start();
        System.out.println("The name of the first thread is: "+th1.getName());
        System.out.println("The name of the first thread is: "+th2.getName());

        System.out.println("The active count of the first thread group is: "+tg1.activeCount());
        System.out.println("The active count of the second thread group is: "+tg2.activeCount());
        System.out.println("The active count of the first thread group is: "+tg1.getName());
        System.out.println("The active count of the second thread group is: "+tg2.getName());
    }
}
