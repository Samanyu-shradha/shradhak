package PracticePrograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ThreadNew extends Thread{

    public ThreadNew(ThreadGroup tg1, String name){
        super(tg1, name);
        start();
    }

    public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}

public class ThreadGroupActiveCount {

    public static void main(String[] args)throws IOException {
        ThreadGroup tg1 = new ThreadGroup("ParentGroup");
        ThreadGroup tg2 = new ThreadGroup(tg1,"ChildGroup");

        ThreadNew th1 = new ThreadNew(tg1,"Thread One");
        ThreadNew th2 = new ThreadNew(tg1,"Thread Two");
        List<ThreadGroup> list = new ArrayList<ThreadGroup>();
        list.add(tg1);
        list.add(tg2);
        System.out.println("The total number of active threads are: "+tg1.activeCount());
        System.out.println("The total number of active group count are: "+tg1.activeGroupCount());
        System.out.println(tg1.getMaxPriority());
        System.out.println(tg2.getMaxPriority());
        System.out.println(tg1.getName());
        System.out.println(tg2.getName());

        System.gc();
        System.out.println(Runtime.getRuntime());
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().maxMemory());

        for(int i=0;i<10;i++){
            new ThreadGroupActiveCount();
            System.out.println(i);
        }
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().maxMemory());


//        Runtime.getRuntime().exec("textedit");

    }
}
