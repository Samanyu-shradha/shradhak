package PracticePrograms;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class workerThread implements Runnable{
    private int number;
    public void run(){
        System.out.println("The execution of the thread starts for: "+number);
        processThread();
        System.out.println("The execution of the thread ends"+number);
    }

    public workerThread(int num){
        this.number=num;
    }

    public void processThread() {
        try {
            Thread.sleep(2000);
        }catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}
public class ThreadPoolCreation {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=0;i<10;i++){
            Runnable r1 = new workerThread(i);
            executor.execute(r1);
        }

        System.out.println("Threadpool ends");
        executor.shutdown();
    }
}
